// Recursion/SumOfSquares.kt
import atomictest.*

fun sumSquares(nums: List<Int>): Int {
  trace(nums)
  if(nums.size == 0)
    return 0
  return nums[0] * nums[0] +
    sumSquares(nums.drop(1))
}

fun main(args: Array<String>) {
  sumSquares(listOf(11,42,47,23,19)) eq 4984
  trace eq """
[11, 42, 47, 23, 19]
[42, 47, 23, 19]
[47, 23, 19]
[23, 19]
[19]
[]
"""
}
