// Varargs/SpreadOperator.kt
import atomictest.eq

fun main(args: Array<String>) {
  val array = intArrayOf(4, 5)  // [1]
  sum(1, 2, 3, *array, 6) eq 21
  // Won't compile:
  // sum(1, 2, 3, array, 6)

  val list = listOf(9, 10, 11)
  sum(*list.toIntArray()) eq 30 // [2]
}
