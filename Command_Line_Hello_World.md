Command-Line Hello World
========================

In which we see how to compile and run the program shown in the "Hello World"
atom in the book, using the latest version (1.4 or higher) of the [Kotlin command-line
compiler](http://kotlinlang.org/docs/tutorials/command-line.html).

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

There's one more thing: When you run `kotlinc`, the resulting program doesn't
have the same name as the source program. Instead, the compiler appends a `Kt`
to the name. To see it, run `ls` or `dir` on the `helloworld` subdirectory.
You'll see that the directory contains `HelloWorldKt.class`. What's important is
the part before the `.class` (You'll learn about the idea of classes in later
atoms). This is the actual name of the program: `HelloWorldKt`.

Now we can run the program:

```
kotlin HelloWorldKt
```

And you'll see the output on the console:

```
Hello, world!
```

## Packages

If the program is in a package, the package name is also required to run the
program. That is, if `Foo.kt` contains a `package` statement:

```
package bar
```

then you cannot simply say:

```
kotlin Foo
```

You'll get a message starting with `error: could not find or load`...

If you were to compile this program, you'd
see there's a new subdirectory called `bar`. The name of the
subdirectory that appears when you run `kotlinc` corresponds to the `package`
name in the program that was compiled.

If the program is packaged under `bar`, we
give the package name followed by a "dot," then the program's name:

```
kotlin bar.FooKt
```

