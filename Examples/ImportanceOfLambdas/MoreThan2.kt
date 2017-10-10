// ImportanceOfLambdas/MoreThan2.kt
import atomictest.eq

fun main(args: Array<String>) {
  val list = listOf(1, 2, 3, 4)
  val moreThan2 = mutableListOf<Int>()
  for (i in list) {
    if (i > 2) {
      moreThan2 += i
    }
  }
  moreThan2 eq listOf(3, 4)
}
