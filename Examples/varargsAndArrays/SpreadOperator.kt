// varargsAndArrays/SpreadOperator.kt
import atomicTest.eq

fun main(args: Array<String>) {
  val array = intArrayOf(4, 5)
  sum(1, 2, 3, *array, 6) eq 21

  // Doesn't compile:
  // sum(1, 2, 3, array, 6)
}
