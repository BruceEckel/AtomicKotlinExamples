// Visibility/Task3.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package constrainingVisibilityExercise3

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

  private fun checkSteps(steps: Int): Boolean {
    if (steps <= 0) {
      println("steps argument must be positive, is $steps")
      return true
    }
    return false
  }

  fun right(steps: Int) {
    if (checkSteps(steps)) return
    x += steps
    x = crossBoundary(x)
  }

  fun left(steps: Int) {
    if (checkSteps(steps)) return
    x -= steps
    x = crossBoundary(x)
  }

  fun down(steps: Int) {
    if (checkSteps(steps)) return
    y += steps
    y = crossBoundary(y)
  }

  fun up(steps: Int) {
    if (checkSteps(steps)) return
    y -= steps
    y = crossBoundary(y)
  }

  fun getLocation(): String = "($x, $y)"

  override fun toString() = "Robot(x=$x,y = $y)"
}

fun main() {
  val robot = Robot(10, 1, 1)
  robot.right(-1)
}
/* Output:
steps argument must be positive, is -1
*/
