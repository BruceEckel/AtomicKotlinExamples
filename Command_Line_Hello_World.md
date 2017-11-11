Command-Line Hello World
========================

In which we see how to compile and run the program shown in the "Hello World"
atom in the book, using the command-line compiler.

Open up a console window in the `HelloWorld` directory, where you'll see
`HelloWorld.kt`, and type:

```
kotlinc HelloWorld.kt
```

`kotlinc` means "Kotlin compiler." The compiler is the program that takes
your program and turns it into something that will run; this process is
called *compiling*.

Assuming you've typed the code correctly, you should get back the console
prompt, with no other messages. If you get error messages, try to discover
where you've mis-typed the code, correct it and try again. Once you are
successful, you're ready to run the program.

Display the directory using `ls` for Mac/Linux and `dir` for Windows. You'll
see there's a new subdirectory called `helloworld`. The name of the
subdirectory that appears when you run `kotlinc` corresponds to the `package`
name in the program that was compiled.

The package name is also required to run the program. That is, you cannot simply
say:

```
kotlin HelloWorld
```

Try it---you'll get a message starting with `error: could not find or load`...

There's one more thing: When you run `kotlinc`, the resulting program doesn't
have the same name as the source program. Instead, the compiler appends a `Kt`
to the name. To see it, run `ls` or `dir` on the `helloworld` subdirectory.
You'll see that the directory contains `HelloWorldKt.class`. What's important is
the part before the `.class` (You'll learn about the idea of classes in later
atoms). This is the actual name of the program: `HelloWorldKt`.

Now we can run the program, by giving the package name followed by a "dot," then
the program's name:

```
kotlin helloworld.HelloWorldKt
```

And you'll see the output on the console:

```
Hello, world!
```

When working from the console, you'll follow this pattern for all the examples
in this book.
