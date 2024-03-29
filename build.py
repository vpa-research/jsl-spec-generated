import argparse
import os
import subprocess
import sys
from time import sleep
import tempfile

# === subroutines ===

TEMP_SOURCES_FILE = os.path.join(tempfile.gettempdir(), 'jsl-spec-build-paths.txt')

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
        for name in files:
            if name.endswith('.java'):
                res.append(os.path.join(dir_path, name))
        #if has_java_sources(files):
            # res.append(os.path.join(dir_path, '*'))

    return res

def collect_source_files(src_root: str, thirdparty_root: str, runtime_root: str) -> set[str]:
    res = set()
    res.update(collect_java_file_dirs_from(thirdparty_root))
    res.update(collect_java_file_dirs_from(runtime_root))
    res.update(collect_java_file_dirs_from(src_root))
    return list(res)

def update_paths(paths: list[str]) -> None:
    with open(TEMP_SOURCES_FILE, 'wt') as f:
        for name in paths:
            f.write(f"{name}\n")


# === CLI and Environment ===

workdir = os.path.abspath(os.curdir)

parser = argparse.ArgumentParser()
parser.add_argument(
    '--compiler', metavar='PATH', default='javac',
    help='a path to the Java compiler executable')
parser.add_argument(
    '--output', metavar='DIR', default='out',
    help='a directory for outputing compiled class files to')
parser.add_argument(
    '--input', metavar='DIR', default='actual',
    help='a directory containing source files')
parser.add_argument(
    '--thirdparty', metavar='DIR', default='thirdparty',
    help='a directory containing API source files')
parser.add_argument(
    '--runtime', metavar='DIR', default='runtime',
    help='a directory containing source files for LibSL runtime environment')
parser.add_argument(
    '--non-interactive', action=argparse._StoreTrueAction, default=False,
    help='disable script interactivity features')

args = parser.parse_args()
java_compiler  = args.compiler
input_dir      = args.input
thirdparty_dir = args.thirdparty
runtime_dir    = args.runtime
output_dir     = args.output
interactive    = not args.non_interactive


# === main ===

command = [
    java_compiler,
    '-d', output_dir,
    '-g:lines',
    '-nowarn',
    '-XDignore.symbol.file',
    '-Xlint:none',
    '-source', '1.8',
    '-target', '1.8',
    #'--release', '8',
    #'--add-exports=java.base/sun.nio.ch=ALL-UNNAMED',
    f"@{TEMP_SOURCES_FILE}",
]
update_paths(collect_source_files(input_dir, thirdparty_dir, runtime_dir))

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
