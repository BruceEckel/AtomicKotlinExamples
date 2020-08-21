// HigherOrderFunctions/TypeDeclarations.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
import atomictest.eq

fun main() {
  val helloWorld: () -> String =
    { "Hello, world!" }
  helloWorld() eq "Hello, world!"

  val sum: (Int, Int) -> Int =
    { x, y -> x + y }
  sum(1, 2) eq 3
}
