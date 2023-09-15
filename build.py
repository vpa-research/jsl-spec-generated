import argparse
import os
import subprocess
import sys
from time import sleep

# === subroutines ===

def has_java_sources(file_names: list[str]) -> bool:
    for name in file_names:
        if name.endswith('.java'):
            return True
    return False

def collect_java_file_dirs_from(root: str) -> list[str]:
    if not os.path.exists(root):
        return []

    res = list()

    for (dir_path, dirs, files) in os.walk(root):
        if has_java_sources(files):
            res.append(os.path.join(dir_path, '*'))

    return res

def collect_source_files(src_root: str, stub_root: str, runtime_root: str) -> set[str]:
    res = set()
    res.update(collect_java_file_dirs_from(stub_root))
    res.update(collect_java_file_dirs_from(runtime_root))
    res.update(collect_java_file_dirs_from(src_root))
    return res


# === CLI and Environment ===

workdir = os.path.abspath(os.curdir)

parser = argparse.ArgumentParser()
parser.add_argument(
    '--compiler-path', metavar='PATH', default='javac',
    help='a path to the Java compiler executable')
parser.add_argument(
    '--output-dir', metavar='DIR', default='out',
    help='a directory for outputing compiled class files to')
parser.add_argument(
    '--input-dir', metavar='DIR', default='actual',
    help='a directory containing source files')
parser.add_argument(
    '--stub-dir', metavar='DIR', default='stubs',
    help='a directory containing stub source files for JacoDB annotation and USVM engine')
parser.add_argument(
    '--runtime-dir', metavar='DIR', default='runtime',
    help='a directory containing source files for LibSL runtime environment')
parser.add_argument(
    '--non-interactive', action=argparse._StoreTrueAction, default=False,
    help='disable script interactivity features')

args = parser.parse_args()
java_compiler = args.compiler_path
input_dir     = args.input_dir
stub_dir      = args.stub_dir
runtime_dir   = args.runtime_dir
output_dir    = args.output_dir
interactive   = not args.non_interactive


# === main ===

command = [
    java_compiler,
    '-d', output_dir,
    '-g:lines',
    '-nowarn',
    '-Xlint:none',
    '-target', '11',
    '--patch-module', 'java.base=actual',

]
command.extend(collect_source_files(input_dir, stub_dir, runtime_dir))

print('[~] Command:', ' '.join(command))

process = subprocess.run(command, shell=True, cwd=workdir, capture_output=True, text=True, encoding='utf-8', check=False, timeout=60.0)
if process.returncode != 0:
    print('[x] ERROR: process returned a non-zero value:')
    print(process.stderr)
    if interactive:
        print('Press ENTER to continue...')
        sys.stdin.readline()
    sys.exit(-1)
else:
    print('[i] Success!')
    if interactive:
        sleep(1)
