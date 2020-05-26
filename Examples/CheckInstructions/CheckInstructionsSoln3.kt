// CheckInstructions/CheckInstructionsSoln3.kt
package checkinstructionssoln3
import atomictest.*

class Level(
  val range: IntRange,
  private var level: Int = range.start
) {
  init {
    require(level in range) {
      "Initial level out of range: $level"
    }
  }
  val value: Int
    get() = level
  fun up(): Int {
    if (level + 1 in range)
      level++
    return level
  }
  fun down(): Int {
    if (level - 1 in range)
      level--
    return level
  }
  fun set(new: Int) {
    require(new in range) {
      "set() argument out of range: $new"
    }
    level = new
  }
}

fun main() {
  val level = Level(1..10)
  println(capture { level.set(0) })
  println(capture { level.set(11) })
  println(capture { Level(1..10, -1) })
  println(capture { Level(1..10, 42) })
  fun testUp() =
    println("${level.value}, ${level.up()}")
  fun testDown() =
    println("${level.value}, ${level.down()}")
  testUp()
  testDown()
  level.set(10)
  testUp()
  level.set(1)
  testDown()
}
/* Output:
IllegalArgumentException: set() argument out of range: 0
IllegalArgumentException: set() argument out of range: 11
IllegalArgumentException: Initial level out of range: -1
IllegalArgumentException: Initial level out of range: 42
1, 2
2, 1
10, 10
1, 1
 */
