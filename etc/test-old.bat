@echo off& python -x %0".bat" %* &goto :eof
# Build & run entire book, capture output and find errors
# Open associated kt and markdown files at location of source
# Uses tee from http://unxutils.sourceforge.net
from subprocess import call
from pathlib import Path
import os

def find_command(output, n):
    for i in range(n, 0, -1):
        if output[i].startswith(":"):
            return i, output[i][1:] + ".kt"

def find_error_end(output, n):
    for i in range(n, len(output)):
        if output[i].startswith(":"):
            return i

example_dir = Path.cwd() / "Examples"
markdown_dir = Path.cwd().parent / "AtomicKotlin" / "Markdown"

call(f"gradlew run | tee test_output.txt 2>&1", shell=True)
output = (Path.cwd() / "test_output.txt").read_text().splitlines()
errors = [n for n, e in enumerate(output) if "[Error]" in e]
print(errors)
for n in errors:
    command_n, ktname = find_command(output, n)
    end_n = find_error_end(output, n)
    srcfiles = list(example_dir.rglob(ktname))
    assert(len(srcfiles) == 1)
    srcfile = srcfiles[0]
    print(f" {srcfile.relative_to(example_dir)} ".center(60, "="))
    for i in range(command_n, end_n):
        print(output[i])
    os.system(f"subl {srcfile}:{command_n}")
    slugline = srcfile.read_text().splitlines()[0]
    # print(f"slugline: {slugline}")
    for md in markdown_dir.glob("*.md"):
        for n, line in enumerate(md.read_text().splitlines()):
            if slugline in line:
                os.system(f"subl {md}:{n}")
                break
