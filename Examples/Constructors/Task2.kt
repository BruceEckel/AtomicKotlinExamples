// Constructors/Task2.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package constructorsExercise2

class Robot(val fieldSize: Int, var x: Int, var y: Int) {

  fun crossBoundary(coordinate: Int): Int {
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
}

fun main() {
/*
    val robot = Robot(10, 1, 1)
    println(robot.getLocation())
    robot.up(2)
    println(robot.getLocation())
    robot.left(10)
    println(robot.getLocation())
*/
}
/* Expected output:
(1, 1)
(1, 9)
(1, 9)
*/
