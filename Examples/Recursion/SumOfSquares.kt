// Recursion/SumOfSquares.kt
import atomictest.eq

fun sumSquares(nums: List<Int>): Int {
  println(nums)
  if (nums.size == 0)
    return 0
  return nums[0] * nums[0] +
    sumSquares(nums.drop(1))
}

fun main(args: Array<String>) {
  sumSquares(listOf(11, 42, 47, 23, 19)) eq
    4984
}
/* Output:
[11, 42, 47, 23, 19]
[42, 47, 23, 19]
[47, 23, 19]
[23, 19]
[19]
[]
4984
*/
