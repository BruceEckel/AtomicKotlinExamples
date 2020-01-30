// RobotExplorer2/Players2.kt
package robotexplorer2
import robotexplorer.Urge

interface Player {
  val symbol: Char
  val room: Room
  fun id() = symbol.toString()
  fun interact(robot: Robot): Room
}

class Void() : Player {
  override val symbol = '~'
  override val room: Room
    get() = throw IllegalAccessException()
  override fun interact(robot: Robot) =
    robot.room
}

class Wall(override val room: Room) : Player {
  override val symbol = '#'
  override fun interact(robot: Robot) =
    robot.room
}

class Food(override val room: Room) : Player {
  override val symbol = '.'
  override fun interact(robot: Robot): Room {
    room.player = Empty(room)
    return room
  }
}

class Empty(
  override val room: Room
) : Player {
  override val symbol = '_'
  override fun interact(robot: Robot) = room
}

class EndGame(
  override val room: Room
) : Player {
  override val symbol = '!'
  override fun interact(robot: Robot) =
    Room(EndGame(room))
}

class Robot(
  override var room: Room
) : Player {
  override val symbol = 'R'
  // Shouldn't happen:
  override fun interact(robot: Robot) =
    throw IllegalAccessException()
  fun move(urge: Urge) {
    val nextRoom: Room = room.doors.open(urge)
    room = nextRoom.player.interact(this)
  }
}

class Teleport(
  val target: Char, override val room: Room
) : Player {
  override val symbol = 'T'
  var targetRoom = Room()
  override fun id() = target.toString()
  override fun interact(robot: Robot) =
    targetRoom
}

fun factory(ch: Char): Room {
  val room = Room()
  when (ch) {
    '#' -> room.player = Wall(room)
    '.' -> room.player = Food(room)
    '_' -> room.player = Empty(room)
    '/' -> room.player = Void()
    '!' -> room.player = EndGame(room)
    in 'a'..'z' ->
      room.player = Teleport(ch, room)
  }
  return room
}
