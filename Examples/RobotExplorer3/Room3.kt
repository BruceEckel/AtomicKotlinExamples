// RobotExplorer3/Room3.kt
package robotexplorer3

class Room(var player: Player = Void()) {
  val doors = Doors()
  override fun toString() = "Room($player)"
}
