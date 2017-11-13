// Coroutines/LazySequence.kt
import kotlin.coroutines.experimental.*
import atomictest.eq

val items = listOf(
  1, 19, 34, 22, 97, 11, 72, 99)

fun main(args: Array<String>) {
  val squares = buildSequence {
    for(n in items)
      yield(n * n)
  }
  squares.toList() eq
  "[1, 361, 1156, 484, 9409, 121, 5184, 9801]"
}
