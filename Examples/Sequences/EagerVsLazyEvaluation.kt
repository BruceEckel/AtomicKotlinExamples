// Sequences/EagerVsLazyEvaluation.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package sequences
import atomictest.*

fun Int.isEven(): Boolean {
  trace("$this.isEven()")
  return this % 2 == 0
}

fun Int.square(): Int {
  trace("$this.square()")
  return this * this
}

fun Int.lessThanTen(): Boolean {
  trace("$this.lessThanTen()")
  return this < 10
}

fun main() {
  val list = listOf(1, 2, 3, 4)
  trace(">>> List:")
  trace(
    list
      .filter(Int::isEven)
      .map(Int::square)
      .any(Int::lessThanTen)
  )
  trace(">>> Sequence:")
  trace(
    list.asSequence()
      .filter(Int::isEven)
      .map(Int::square)
      .any(Int::lessThanTen)
  )
  trace eq """
    >>> List:
    1.isEven()
    2.isEven()
    3.isEven()
    4.isEven()
    2.square()
    4.square()
    4.lessThanTen()
    true
    >>> Sequence:
    1.isEven()
    2.isEven()
    2.square()
    4.lessThanTen()
    true
  """
}
