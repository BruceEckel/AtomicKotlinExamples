// Coroutines/LazySequence.kt
import atomictest.eq

val items = listOf(
  1, 19, 34, 22, 97, 11, 72)

fun main(args: Array<String>) {
  val squares = sequence {
    for (n in items)
      yield(n * n)
  }
  squares.toList() eq
    "[1, 361, 1156, 484, 9409, 121, 5184]"
}
