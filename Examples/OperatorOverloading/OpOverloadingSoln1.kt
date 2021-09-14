// OperatorOverloading/OpOverloadingSoln1.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package operatorOverloadingExercise1
import atomictest.*

class WrapRange(
  val range: IntRange,
  private var current: Int = range.first
) {
  init {
    require(current in range) {
      "'current' out of range: $current"
    }
  }
  override fun toString() = "$current"
  operator fun inc(): WrapRange {
    current = if (current == range.last) range.first else current + 1
    return this
  }
  operator fun dec(): WrapRange {
    current = if (current == range.first) range.last else current - 1
    return this
  }
}

fun main() {
  val range = 2..5
  var wr = WrapRange(range)
  trace(wr)
  repeat(5) {
    wr++
    trace(wr)
  }
  trace("-")
  repeat(2) {
    wr--
    trace(wr)
  }
  trace eq "2 3 4 5 2 3 - 2 5"

  capture { WrapRange(range, 6) } eq
    "IllegalArgumentException: " +
    "'current' out of range: 6"
  capture { WrapRange(range, -1) } eq
    "IllegalArgumentException: " +
    "'current' out of range: -1"
}
