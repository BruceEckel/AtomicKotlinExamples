#!/usr/bin/env python3.6
from subprocess import call
from pathlib import Path
import sys, os

def ensure(test, msg):
    if not test:
        print(msg)
        sys.exit(1)

def gradle(kname):
    home = Path.cwd()
    kpath = home / kname
    ensure(kpath.exists(), f"{kpath.name} doesn't exist")
    ensure("fun main(" in kpath.read_text(), f"No main() in {kpath.name}")
    os.chdir(home.parent.parent)
    call(f"gradle {kpath.stem}", shell=True)
    os.chdir(home)

def multiple(kname_list):
    knames = " ".join(kname_list)
    home = Path.cwd()
    os.chdir(home.parent.parent)
    call(f"gradle {knames}", shell=True)
    os.chdir(home)

if len(sys.argv) > 1:
    gradle(sys.argv[1])
else:
    multiple([kpath.stem for kpath in Path.cwd().glob("*.kt")
              if "fun main(" in kpath.read_text()])
