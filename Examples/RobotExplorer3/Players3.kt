// RobotExplorer3/Players3.kt
package robotexplorer3
import robotexplorer.Urge

interface Player {
  val symbol: Char
  val room: Room
  fun id() = symbol.toString()
  fun interact(robot: Robot): Room
}

val prototypes =
  mutableListOf<Player>()

class Void() : Player {
  override val symbol = '~'
  override val room: Room
    get() = throw IllegalAccessException()
  override fun interact(robot: Robot) =
    robot.room // Stay in old room
  companion object Prototype {
    init {
      prototypes.add(Void())
    }
  }
}

class Wall(override val room: Room) : Player {
  override val symbol = '#'
  override fun interact(robot: Robot) =
    robot.room // Stay in old room
  companion object Prototype {
    init {
      prototypes.add(Wall(Room()))
    }
  }
}

class Food(override val room: Room) : Player {
  override val symbol = '.'
  override fun interact(robot: Robot): Room {
    robot.energy++
    room.player = Empty(room)
    return room // Move into new room
  }
  companion object Prototype {
    init {
      prototypes.add(Food(Room()))
    }
  }
}

class Empty(
  override val room: Room
) : Player {
  override val symbol = '_'
  // Move into new room:
  override fun interact(robot: Robot) = room
  companion object Prototype {
    init {
      prototypes.add(Empty(Room()))
    }
  }
}

class EndGame(
  override val room: Room
) : Player {
  override val symbol = '!'
  override fun interact(robot: Robot) =
    Room(EndGame(room))
  companion object Prototype {
    init {
      prototypes.add(EndGame(Room()))
    }
  }
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
  companion object Prototype {
    init {
      prototypes.add(Robot(Room()))
    }
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
  companion object Prototype {
    init {
      prototypes.add(Teleport('P', Room()))
    }
  }
}

class Bomb(override val room: Room) : Player {
  override val symbol = '*'
  override fun interact(robot: Robot): Room {
    robot.energy = 0 // Bomb erases energy
    room.player = Empty(room)
    return room
  }
  companion object Prototype {
    init {
      prototypes.add(Bomb(Room()))
    }
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
