// Lambdas/JoinToString.kt
import atomictest.eq

fun main(args: Array<String>) {
  val list = listOf('a', 'b', 'c', 'd')
  list.joinToString(" ") { "[$it]" } eq
    "[a] [b] [c] [d]"
}
