// ImportanceOfLambdas/EvenFilter.kt
import atomictest.eq

fun evenFilter(nums: List<Int>): List<Int> {
  val result = mutableListOf<Int>()
  for(i in nums)
    if(i % 2 == 0)          // [1]
      result += i
  return result
}

fun main(args: Array<String>) {
  evenFilter(listOf(1, 2, 3, 4)) eq
    listOf(2, 4)
}
