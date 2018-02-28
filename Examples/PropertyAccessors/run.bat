@echo off& python -x %0".bat" %* &goto :eof
from subprocess import call
from pathlib import Path
import sys, os

def ensure(test, msg):
    if not test:
        print(msg)
        sys.exit(1)

def gradle(name):
    home = Path.cwd()
    fpath = home / name
    ensure(fpath.exists(), f"{fpath.name} doesn't exist")
    ensure("main(" in fpath.read_text(), f"No main() in {fpath.name}")
    os.chdir(home.parent.parent)
    call(f"./gradlew {fpath.stem}", shell=True)
    os.chdir(home)

def multiple(name_list):
    names = " ".join(name_list)
    home = Path.cwd()
    os.chdir(home.parent.parent)
    call(f"./gradlew {names}", shell=True)
    os.chdir(home)

def glob(ext):
    return list(Path.cwd().glob("*." + ext))

if len(sys.argv) > 1:
    gradle(sys.argv[1])
else:
    multiple([fpath.stem for fpath in glob("kt") + glob("java")
              if "main(" in fpath.read_text()])
