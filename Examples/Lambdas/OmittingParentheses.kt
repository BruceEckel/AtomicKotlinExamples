// Lambdas/OmittingParentheses.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
import atomictest.eq

fun main() {
  val list = listOf('a', 'b', 'c', 'd')
  val result = list.map { "[$it]" }
  result eq
    listOf("[a]", "[b]", "[c]", "[d]")
}
