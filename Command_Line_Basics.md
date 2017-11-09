Command-Line Basics
===================

Because it is possible for a "dedicated beginner"
to learn programming from this book, we 
assume you haven't previously used the computer's command-line shell. If you
have, you can go directly to the installation instructions.

If any terminology or processes described here are still not clear to
you, you can usually find explanations or answers through
[Google](https://www.google.com/). For more specific issues or problems,
try [StackOverflow](http://stackoverflow.com/). Sometimes you can find
installation instructions on [YouTube](https://www.youtube.com/).

Editors
-------

To create and modify Kotlin program files---the code listings shown in this
book---you need a program called an *editor*. You'll also need the editor to
make changes to your system configuration files, which is sometimes required
during installation.

Programming editors vary from heavyweight *Integrated Development Environments*
(IDEs, like Eclipse, NetBeans and IntelliJ IDEA) to more basic text manipulation
applications. If you already have an IDE and are comfortable with it, feel free
to use that for this book, but in the interest of keeping things simple, We'll use
the *Atom* editor. Find it at
[atom.io](https://atom.io/).

Atom is free and open-source, is very simple to install, works on all platforms
(Windows, Mac and Linux), and has a built-in Kotlin mode that is automatically
invoked when you open a Kotlin file. It isn't a heavy-duty IDE so it doesn't get
confusing, which is ideal for this book. On the other hand, it has some handy
editing features that you'll probably come to love. More details are on their
site.

There are many other editors; these are a subculture unto themselves and people
even get into heated arguments about their merits. If you find one you like
better, it's not too hard to change. The important thing is to choose one and
get comfortable with it.

The Shell
---------

If you haven't programmed before, you might be unfamiliar with your operating
system *shell* (also called the *command prompt* in Windows). The shell harkens
back to the early days of computing when everything happened by typing commands
and the computer responded by displaying responses---everything was text-based.

Although it can seem primitive in the age of graphical user interfaces, a shell
provides a surprising number of valuable features. We'll use it regularly in
this book, both as part of the installation process and to run Kotlin programs.

### Starting a Shell

**Mac**: Click on the *Spotlight* (the magnifying-glass icon in the upper-right
corner of the screen) and type "terminal." Click on the application that looks
like a little TV screen (you might also be able to hit "Return"). This starts a
shell in your home directory.

**Windows**: First, start the Windows Explorer to navigate through your
directories:

- *Windows 7*: click the "Start" button in the lower left corner of the screen.
In the Start Menu search box area type "explorer" and then press the "Enter"
key.

- *Windows 8*: click Windows+Q, type "explorer" and then press the "Enter" key.

- *Windows 10*: click Windows+E.

Once the Windows Explorer is running, move through the folders on your computer
by double-clicking on them with the mouse. Navigate to the desired folder. Now
click the file tab at the top left of the Explorer window and select "Open
command prompt." This opens a shell in the destination directory.

**Linux**: To open a shell in your home directory:

- *Debian*: Press Alt+F2. In the dialog that pops up, type 'gnome-terminal'

- *Ubuntu*: Either right-click on the desktop and select 'Open Terminal', or
  press Ctrl+Alt+T

- *Redhat*: Right-click on the desktop and select 'Open Terminal'

- *Fedora*: Press Alt+F2. In the dialog that pops up, type 'gnome-terminal'


### Directories

*Directories* are one of the fundamental elements of a shell. Directories hold
files, as well as other directories. Think of a directory as a tree with
branches. If `books` is a directory on your system and it has two other
directories as branches, for example `math` and `art`, we say that you have a
directory `books` with two *subdirectories* `math` and `art`. We refer to them
as `books/math` and `books/art` since `books` is their *parent* directory.
Note that Windows uses backslashes rather than forward slashes to separate the
parts of a directory.

### Basic Shell Operations

The shell operations I show here are approximately identical across operating
systems. For the purposes of this book, here are the essential operations in a
shell:

-   **Change directory**: Use `cd` followed by the name of the
    directory where you want to move, or `cd ..` if you want to move
    up a directory. If you want to move to a different directory while
    remembering where you came from, use `pushd` followed by the different
    directory name. Then, to return to the previous directory, just say
    `popd`.

-   **Directory listing**: `ls` (`dir` in Windows) displays all the files and
    subdirectory names in the current directory. Use the wildcard `*` (asterisk) to
    narrow your search. For example, if you want to list all the files ending in
    ".kt," you say `ls *.kt` (Windows: `dir *.kt`). If you want to list the
    files starting with "F" and ending in ".kt," you say `ls F*.kt` (Windows:
    `dir F*.kt`).

-   **Create a directory**: use the `mkdir` ("make directory") command
    (Windows: `md`), followed by the name of the directory you want to create.
    For example, `mkdir books` (Windows: `md books`).

-   **Remove a file**: Use `rm` ("remove") followed by the name of the file
    you wish to remove (Windows: `del`). For example, `rm somefile.kt` (Windows:
    `del somefile.kt`).

-   **Remove a directory**: use the `rm -r` command to remove the files in
    the directory and the directory itself (Windows: `deltree`). For example,
    `rm -r books` (Windows: `deltree books`).

-   **Repeat a command**: The "up arrow" on all three operating
    systems moves through previous commands so you can edit and
    repeat them. On Mac/Linux, `!!` repeats the last command and
    `!n` repeats the nth command.

-   **Command history**: Use `history` in Mac/Linux or press the F7 key in Windows.
    This gives you a list of all the commands you've entered. Mac/Linux provides
    numbers to refer to when you want to repeat a command.

-   **Unpacking a zip archive**: A file name ending with `.zip` is an
    archive containing other files in a compressed format. Both Linux
    and Mac have command-line `unzip` utilities, and it's possible
    to install a command-line `unzip` for Windows via the Internet.
    However, in all three systems the graphical file browser (Windows
    Explorer, the Mac Finder, or Nautilus or equivalent on Linux) will
    browse to the directory containing your zip file. Then
    right-mouse-click on the file and select "Open" on the Mac, "Extract
    Here" on Linux, or "Extract all ..." on Windows.

To learn more about your shell, search Wikipedia for [Windows
Shell](https://en.wikipedia.org/wiki/Windows_shell) or [Bash
Shell](https://en.wikipedia.org/wiki/Bash_(Unix_shell)) for Mac/Linux.

