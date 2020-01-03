// ObjectOrientedDesign/Room.kt
package robotexplorer1
import robotexplorer1.Player.*

class Room(var player: Any = Empty) {
  val doors = Doors()
  fun enter(robot: Robot): Room {
    when (player) {
      // Stay in original room:
      Wall, Edge -> return robot.room
      is Teleport ->
        return (player as Teleport).targetRoom
      EndGame -> return Room(EndGame)
      Food -> player = Empty // Eat food
      Empty -> {}
    }
    return this // Enter new room
  }
}
