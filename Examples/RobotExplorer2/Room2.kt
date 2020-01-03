// RobotExplorer2/Room2.kt
package robotexplorer2

class Room(var player: Any = Empty()) {
  val doors = Doors()
  fun enter(robot: Robot): Room {
    when (val p = player) {
      is Wall, is Edge -> return robot.room
      is Teleport -> return p.targetRoom
      is EndGame -> return Room(EndGame())
      is Food -> player = Empty() // Eat food
      is Empty -> {}
    }
    return this // Enter new room
  }
}
