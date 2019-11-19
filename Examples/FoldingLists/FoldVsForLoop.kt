// FoldingLists/FoldVsForLoop.kt
import atomictest.eq

fun main() {
  val list = listOf(1, 10, 100, 1000)

  val initial = 0
  val operation =
    { sum: Int, i: Int -> sum + i }

  val s = list.fold(initial) { sum, i ->
    operation(sum, i)
  }
  s eq 1111

  var accumulator = initial
  for (i in list) {
    accumulator = operation(accumulator, i)
  }
  accumulator eq 1111
}
