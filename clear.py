import argparse
import os
from time import sleep

# === subroutines ===

def collect_files_for_removal(root: str) -> tuple[list[str], list[str]]:
    if not os.path.exists(root):
        return ([], [])

    res_files = list()
    res_folders = list()

    for (dir_path, dirs, files) in os.walk(root, topdown=False):
        files = [os.path.join(dir_path, file) for file in files if file.endswith('.class')]
        res_files.extend(files)
        res_folders.append(dir_path)
    res_folders.remove(root)

    return (res_folders, res_files)


# === CLI and Environment ===

workdir = os.path.abspath(os.curdir)

parser = argparse.ArgumentParser()
parser.add_argument(
    '--output-dir', metavar='DIR', default='out',
    help='a directory with *.CLASS files')

args = parser.parse_args()
output_dir = args.output_dir


# === main ===

output_dir = os.path.abspath(output_dir)
print('[i] Cleaning output directory:', output_dir)

dirs, files = collect_files_for_removal(output_dir)

# files first
for path in files:
    os.remove(path)

# then folders
for path in dirs:
    os.rmdir(path)

print('[i] Done!')
sleep(1)
