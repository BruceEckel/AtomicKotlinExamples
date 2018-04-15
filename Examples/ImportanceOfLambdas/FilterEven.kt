// ImportanceOfLambdas/FilterEven.kt
import atomictest.eq

fun filterEven(nums: List<Int>): List<Int> {
  val result = mutableListOf<Int>()
  for (i in nums) {
    if (i % 2 == 0) {          // [1]
      result += i
    }
  }
  return result
}

fun main(args: Array<String>) {
  filterEven(listOf(1, 2, 3, 4)) eq
    listOf(2, 4)
}
