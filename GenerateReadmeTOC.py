import pprint
import re
from pathlib import Path

readme_file = Path("README.md")
readme = readme_file.read_text().splitlines()
contents_header = "## Contents"


def before_toc(txt):
    result = []
    for line in txt:
        result.append(line)
        if line.startswith(contents_header):
            return result


def after_toc(txt):
    result = []
    passed_contents_header = False
    found_next_header = False
    for line in txt:
        if line.startswith(contents_header):
            passed_contents_header = True
            continue
        if passed_contents_header and line.startswith("#"):
            found_next_header = True
        if found_next_header:
            result.append(line)
    return result


class Level:
    def __init__(self, level: int):
        self.level = level
        self.markdown = None
        if self.level == 1:
            self.markdown = "- "
        elif self.level == 2:
            self.markdown = "  * "
        elif self.level == 3:
            self.markdown = "    + "

    def __str__(self):
        return self.markdown


class TOCEntry:
    def __init__(self, header: str):
        level, self.text = header.split(maxsplit=1)
        self.level = Level(len(level.strip()))
        link1 = re.sub("[^0-9a-zA-Z]+", " ", self.text.lower()).strip()
        self.link = "-".join(link1.split())

    def __str__(self):
        return f"{self.level}[{self.text}](#{self.link})"


def create_toc(body):
    raw = []
    for line in body:
        if line.startswith("#"):
            raw.append(line)
    return [str(TOCEntry(line)) for line in raw] + [""]


new_readme = before_toc(readme) + create_toc(after_toc(readme)) + after_toc(readme) + [""]

readme_file.write_text("\n".join(new_readme))
