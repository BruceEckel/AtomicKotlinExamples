// Visibility/Task2.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package constrainingVisibilityExercise2

class Robot(
  private val fieldSize: Int,
  private var x: Int,
  private var y: Int
) {
  private fun crossBoundary(coordinate: Int): Int {
    val inBounds = coordinate % fieldSize
    return if (inBounds < 0) {
      fieldSize + inBounds
    } else {
      inBounds
    }
  }

  fun right(steps: Int) {
    x += steps
    x = crossBoundary(x)
  }

  fun left(steps: Int) {
    x -= steps
    x = crossBoundary(x)
  }

  fun down(steps: Int) {
    y += steps
    y = crossBoundary(y)
  }

  fun up(steps: Int) {
    y -= steps
    y = crossBoundary(y)
  }

  fun getLocation(): String = "($x, $y)"

  override fun toString() = "Robot(x=$x, y=$y)"
}

fun main() {
  val robot = Robot(10, 1, 1)
  // Should be "can't access x" error:
//  println(robot.x)
}
