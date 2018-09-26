// Lambdas/JoinToString.kt
import atomictest.eq

fun main() {
  val list = listOf('a', 'b', 'c', 'd')
  list.joinToString(" ") { "[$it]" } eq
    "[a] [b] [c] [d]"
}
