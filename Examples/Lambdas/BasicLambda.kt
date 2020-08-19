// Lambdas/BasicLambda.kt
// ©2020 Mindview LLC. See Copyright.txt for permissions.
import atomictest.eq

fun main() {
  val list = listOf(1, 2, 3, 4)
  val result = list.map({ n: Int -> "[$n]" })
  result eq listOf("[1]", "[2]", "[3]", "[4]")
}
