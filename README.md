# Atomic Kotlin Examples

**NOTE:** Currently the *AtomicKotlin.com* URL brings you to this repository,
but eventually that will take you to the support site for the book.

These are the code examples from the book *Atomic Kotlin*, created by an
automatic extraction process directly from the book. This repository provides
a test of the code that is shown in the book, to verify that it is correct.

Although you can download this repository and run the build system, the
examples are more conveniently available pre-integrated with the Intellij IDEA
development environment, along with the exercises and solutions for the book.
See *AtomicKotlin.com* for the IDEA examples {{ To be configured }}.

{{ There may be additional convenient ways of using the examples }}

A thorough introduction to the command line and installing and running the
tools is found in *Atomic Kotlin*.

## Quick Version

Before you can run the examples from this repository, you must install:

1. [Java 8](http://www.oracle.com/technetwork/java/javase/downloads/index.html).

2. The latest version (1.1 or better) of the [Kotlin command-line
compiler](http://kotlinlang.org/docs/tutorials/command-line.html).

If you just want to download and check the code, [Download
Here](https://github.com/BruceEckel/AtomicKotlinExamples/archive/master.zip)
and unzip into your destination directory. Open a shell/command window and
move into the root of that directory. You'll know you are in the right
directory if you see the files `gradlew` and `gradlew.bat`.

On Mac/Linux, enter:

```
./gradlew run
```

On Windows, enter

```
gradlew run
```

You'll need an Internet connection the first time you compile the code,
because Gradle needs to first install itself, then all the support libraries.
Once these are installed you can perform additional compiling and running
offline.

If all goes well, you will see a bunch of warning messages, and then the
examples will run. Everything should complete without errors.

All the book examples are in the subdirectory `Examples` in subdirectories
corresponding to the atom names.

## Detailed Instructions

If you are not familiar with the command line, first read [Command-Line 
Basics](https://github.com/BruceEckel/AtomicKotlinExamples/blob/master/Command_Line_Basics.md).

### Install Java

Kotlin runs on top of Java, so you must first install Java (you only need basic
Java; the development kit also works but is not required). In this book we use
JDK8 (Java 1.8).

#### Windows

1. Follow the instructions at this link to [Install Chocolatey](https://chocolatey.org/).

2. At a shell prompt, type: `choco install jdk8`. This  takes some time,
but when it's finished Java is installed and the necessary environment
variables are set.

#### Macintosh

The Mac comes with a much older version of Java that won't work for the
examples in this book, so you'll need to update it to Java 8.

  1.  Follow the instructions at this link to [Install HomeBrew](http://brew.sh/)

  2.  At a shell prompt, first type `brew update`. When that completes, enter
      `brew cask install java`.

#### Linux

Use the standard package installer with the following shell commands:

*Ubuntu/Debian*:

  1. `sudo apt-get update`

  2. `sudo apt-get install default-jdk`

*Fedora/Redhat*:

  1. `su -c "yum install java-1.8.0-openjdk"`


### Verify Your Installation

Open a new shell and type:

```
java -version
```

You should see something like the following (Version numbers and actual text
will vary):

```
java version "1.8.0_102"
Java(TM) SE Runtime Environment (build 1.8.0_102-b14)
Java HotSpot(TM) 64-Bit Server VM (build 25.102-b14, mixed mode)
```

If you see a message that the command is not found or not recognized, review
the installation instructions in this chapter. If you still can't get it to work,
check [StackOverflow](http://stackoverflow.com/search?q=installing+java).

### Install Kotlin

In this book, we use Kotlin version 1.1, the latest available at the
time. The main download site for Kotlin is
[www.kt-lang.org/downloads](http://www.kt-lang.org/downloads).

#### Windows

Choose the MSI installer which is custom-made for Windows. Once it
downloads, execute the resulting file by double-clicking on it, then
follow the instructions.

Note: If you are running Windows 8, you might see a message that says
"Windows SmartScreen prevented an unrecognized app from starting.
Running this app might put your PC at risk." Choose "More info" and then
"Run anyway."

When you look in the default installation directory
(`C:\Program Files(x86)\kotlin` or `C:\Program Files\kotlin`), it should contain:

```
bin     doc     lib     api
```

The installer will automatically add the `bin` directory to your execution path.

Now open a new shell and type

```
kotlin -version
```

at the shell prompt. You'll see the version information for your Kotlin
installation.

#### Macintosh

Download the version with the `.tgz` extension. Click the link on
the web page, then select "open with archive utility." This puts it in
your "Downloads" directory and un-archives the file into a folder. (If
you download without opening, open a new Finder window, right-click on
the `.tgz` file, then choose "Open With -> Archive Utility").

Rename the un-archived folder to "Kotlin" and then drag it to your home
directory (the directory with an icon of a home, and is named whatever
your user name is). If you don't see a home icon, open "Finder," choose
"Preferences" and then choose the "Sidebar" icon. Check the box with the
home icon next to your name in the list.

When you look at your `Kotlin` directory, it should contain:

```
bin     doc    examples    lib     man     misc     src
```

#### Linux

**Important**: The standard package installer might not install the most
recent version of Kotlin. There is often a significant delay between a
release of Kotlin and its inclusion in the standard packages. However, the book
examples should work fine with the version installed by the standard installer.

Use the standard package installer, which also installs Java if necessary, with
one of the following shell commands:

*Ubuntu/Debian*: `sudo apt-get install kotlin`

*Fedora/Redhat* release 17+: `sudo yum install kotlin`

(Prior to release 17, Fedora/Redhat contains an old version of Kotlin,
incompatible with this book).


### Installing and Running the Book Examples

Once you have Java installed, the process to install and run the book examples
is the same for all platforms:

1. Download the book examples from the
[GitHub Repository](https://github.com/BruceEckel/AtomicKotlinExamples/archive/master.zip).

2. `unzip` the downloaded file into the directory of your choice.

3. Use the Windows Explorer, the Mac Finder, or Nautilus or equivalent on Linux
to browse to the directory where you uzipped `OnJava8-Examples`, and open a
shell there.

4. If you're in the right directory, you should see files named `gradlew` and
`gradlew.bat` in that directory, along with numerous other files and
directories. The directories correspond to the chapters in the book.

5. At the shell prompt, type `gradlew run` (Windows) or `./gradlew run`
(Mac/Linux).

The first time you do this, Gradle will install itself and numerous other
packages, so it will take some time. After everything is installed, subsequent
builds and runs will be much faster.

Note that you must be connected to the Internet the first time you run `gradlew`
so that Gradle can download the necessary packages.

## Using `run`

In each atom-named subdirectory under the `Examples` directory, you will see
two files: `run.bat` and `run.sh`. These are convenience commands for Windows
and Mac/Linux that allow you to compile and run the examples in that
subdirectory. They are not necessary to build the code, but if you begin
experimenting with individual examples they are helpful.

If you just type `run` (`./run.sh` in Mac/Linux), it will (using
Gradle) compile and run all the examples in the directory. You can also type
`run AnExample.kt` to compile and run the example `AnExample.kt` (assuming it
has a `main()`).

To run these scripts, you must first install [Python
3.6](https://www.python.org/downloads/release/python-363/) or newer.
