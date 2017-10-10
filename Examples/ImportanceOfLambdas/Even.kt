// ImportanceOfLambdas/Even.kt
import atomictest.eq

fun main(args: Array<String>) {
  val list = listOf(1, 2, 3, 4)
  val even = mutableListOf<Int>()
  for (i in list) {
    if (i % 2 == 0) {
      even += i
    }
  }
  even eq listOf(2, 4)
}
