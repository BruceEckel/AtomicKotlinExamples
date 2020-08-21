// Lambdas/LambdaIt.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
import atomictest.eq

fun main() {
  val list = listOf(1, 2, 3, 4)
  val result = list.map({ "[$it]" })
  result eq listOf("[1]", "[2]", "[3]", "[4]")
}
