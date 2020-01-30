// RobotExplorer3/Players3.kt
package robotexplorer3

abstract class Player(val symbol: Char) {
  override fun toString() = symbol.toString()
  abstract fun
    interact(robot: Robot, room: Room): Room
}

class Wall : Player('#') {
  override fun
    interact(robot: Robot, room: Room) =
    robot.room
}

class Food : Player('.') {
  override fun
    interact(robot: Robot, room: Room): Room {
    room.player = Empty()
    return room
  }
}

class Empty : Player('_') {
  override fun
    interact(robot: Robot, room: Room) =
    room
}

class Edge : Player('/') {
  override fun
    interact(robot: Robot, room: Room) =
    robot.room
}

class EndGame : Player('!') {
  override fun
    interact(robot: Robot, room: Room) =
    Room(EndGame())
}


class Robot(var room: Room) : Player('R') {
  override fun // Shouldn't happen
    interact(robot: Robot, room: Room) =
    throw IllegalAccessException()
  fun move(urge: Urge) {
    val nextRoom: Room = room.doors.open(urge)
    room = nextRoom.player
      .interact(this, nextRoom)
  }
}

class Teleport(
  val target: Char
) : Player('T') {
  var originRoom = Room()
  var targetRoom = Room()
  override fun toString() = target.toString()
  override fun
    interact(robot: Robot, room: Room) =
    targetRoom
}

fun factory(ch: Char): Room {
  val room = Room()
  when (ch) {
    // 'R' -> robot.room = room
    '#' -> room.player = Wall()
    '.' -> room.player = Food()
    '_' -> room.player = Empty()
    '/' -> room.player = Edge()
    '!' -> room.player = EndGame()
    else -> {
      val teleport = Teleport(ch)
      teleport.originRoom = room
      room.player = teleport
    }
  }
  return room
}