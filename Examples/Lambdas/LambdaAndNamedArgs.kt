// Lambdas/LambdaAndNamedArgs.kt
import atomictest.eq

fun main() {
  val list = listOf('a', 'b', 'c', 'd')
  list.joinToString(
    separator = " ",
    transform = { "[$it]" }
  ) eq  "[a] [b] [c] [d]"
}
