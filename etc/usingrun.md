# Appendix D: Using `run`

In each atom-named subdirectory under the `Examples` directory, you will see
two files: `run.bat` and `run.sh`. These are convenience commands for Windows
and Mac/Linux that allow you to compile and run the examples in that
subdirectory. They are not necessary to build the code, but if you begin
experimenting with individual examples they are helpful.

To run these scripts, you must first install a recent version of
[Python 3](https://www.python.org/downloads/).

If you just type `run` (`./run.sh` in Mac/Linux), it will (using
Gradle) compile and run all the examples in the directory. You can also type
`run AnExample.kt` to compile and run the example `AnExample.kt` (assuming it
has a `main()`).

If you get a *Permission denied* error on OSX or Linux, run `chmod +x ./run.sh`
