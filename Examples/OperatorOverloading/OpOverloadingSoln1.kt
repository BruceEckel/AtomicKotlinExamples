// OperatorOverloading/OpOverloadingSoln1.kt
package opoverloadingsoln1
import atomictest.*

class WrapRange(
  val range: IntRange,
  private var current: Int = range.start
) {
  init {
    require(current in range) {
      "'current' out of range: $current"
    }
  }
  override fun toString() = "$current"
  operator fun inc(): WrapRange {
    current = (current + 1) % (range.last + 1)
    return this
  }
  operator fun dec(): WrapRange {
    if (current - 1 < 0)
      current = range.last
    else
      current--
    return this
  }
}

fun main() {
  val range = 0..5
  var wr = WrapRange(range)
  fun testUp() =
    println("${wr}, ${wr++}")
  fun testDown() =
    println("${wr}, ${wr--}")
  range.forEach { testUp() }
  println("-----------")
  range.forEach { testDown() }
  capture { WrapRange(range, 6) } eq
    "IllegalArgumentException: " +
    "'current' out of range: 6"
  capture { WrapRange(range, -1) } eq
    "IllegalArgumentException: " +
    "'current' out of range: -1"
}
/* Exercise Output:
0, 1
1, 2
2, 3
3, 4
4, 5
5, 0
-----------
0, 5
5, 4
4, 3
3, 2
2, 1
1, 0
IllegalArgumentException: 'current' out of range: 6
IllegalArgumentException: 'current' out of range: -1
*/
