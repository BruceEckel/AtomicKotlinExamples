// ImportanceOfLambdas/StoringLambda.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
import atomictest.eq

fun main() {
  val list = listOf(1, 2, 3, 4)
  val isEven = { e: Int -> e % 2 == 0 }
  val even: List<Int> = list.filter(isEven)
  val hasEven: Boolean = list.any(isEven)
  even eq listOf(2, 4)
  hasEven eq true
}
