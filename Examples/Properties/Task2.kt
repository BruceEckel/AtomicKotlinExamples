// Properties/Task2.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package propertiesExercise2

class Robot {
  var x = 0
  var y = 0

  fun right(steps: Int) {
    x += steps
  }

  fun left(steps: Int) {
    x -= steps
  }

  fun down(steps: Int) {
    y += steps
  }

  fun up(steps: Int) {
    y -= steps
  }

  fun getLocation(): String = "($x, $y)"
}

fun main() {
  val robot = Robot()
  println(robot.getLocation())
  robot.right(1)
  println(robot.getLocation())
  robot.down(2)
  println(robot.getLocation())
}
/* Output:
(0, 0)
(1, 0)
(1, 2)
*/
