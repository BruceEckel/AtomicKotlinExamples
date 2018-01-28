// ImportanceOfLambdas/GreaterThan2.kt
import atomictest.eq

fun greaterThan2(nums: List<Int>): List<Int> {
  val result = mutableListOf<Int>()
  for (i in nums)
    if (i > 2)               // [1]
      result += i
  return result
}

fun main(args: Array<String>) {
  greaterThan2(listOf(1, 2, 3, 4)) eq
    listOf(3, 4)
}
