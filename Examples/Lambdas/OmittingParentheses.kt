// Lambdas/OmittingParentheses.kt
import atomictest.eq

fun main(args: Array<String>) {
  val list = listOf('a', 'b', 'c', 'd')
  val result = list.map { "[$it]" }
  result eq listOf("[a]", "[b]", "[c]", "[d]")
}
