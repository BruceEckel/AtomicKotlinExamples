// RobotExplorer2/Players2.kt
package robotexplorer2
import robotexplorer1.Urge

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
    robot.room // Stay in old room
}

class Wall(override val room: Room) : Player {
  override val symbol = '#'
  override fun interact(robot: Robot) =
    robot.room // Stay in old room
}

class Food(override val room: Room) : Player {
  override val symbol = '.'
  override fun interact(robot: Robot): Room {
    robot.energy++
    room.player = Empty(room)
    return room // Move into new room
  }
}

class Empty(
  override val room: Room
) : Player {
  override val symbol = '_'
  // Move into new room:
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
  var energy = 0
  // Shouldn't happen:
  override fun interact(robot: Robot) =
    throw IllegalAccessException()
  fun move(urge: Urge) {
    val nextRoom = room.doors.open(urge)
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

class Bomb(override val room: Room) : Player {
  override val symbol = '*'
  override fun interact(robot: Robot): Room {
    robot.energy = 0 // Bomb erases energy
    room.player = Empty(room)
    return room
  }
}

fun factory(ch: Char): Room {
  val room = Room()
  when (ch) {
    'R' -> {} // Handled in Stage
    '#' -> room.player = Wall(room)
    '.' -> room.player = Food(room)
    '_' -> room.player = Empty(room)
    '!' -> room.player = EndGame(room)
    '*' -> room.player = Bomb(room)
    in 'a'..'z' ->
      room.player = Teleport(ch, room)
    else -> throw IllegalStateException("$ch")
  }
  return room
}
