// NonNullAssertions/Task2.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package nonNullAssertionsExercise2
import atomictest.*

fun List<Int>.headPlusTail(): Triple<Int?, Int?, Int?> =
  when {
    isEmpty() -> Triple(null, null, null)
    size == 1 -> Triple(first(), null, first())
    else -> Triple(first(), last(), first() + last())
  }

fun main() {
  val ints = mutableListOf<Int>()
  trace(ints.headPlusTail())
  for (n in -2..10 step 2) {
    ints.add(n)
    trace(ints.headPlusTail())
    trace(ints.headPlusTail()!!.third)
  }
  trace eq """
    (null, null, null)
    (-2, null, -2)
    -2
    (-2, 0, -2)
    -2
    (-2, 2, 0)
    0
    (-2, 4, 2)
    2
    (-2, 6, 4)
    4
    (-2, 8, 6)
    6
    (-2, 10, 8)
    8
  """
}
