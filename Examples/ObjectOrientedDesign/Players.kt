// ObjectOrientedDesign/Players.kt
package robotexplorer

sealed class Player {
  abstract val symbol: Char
  open fun id() = symbol.toString()
  abstract val room: Room
  override fun toString() =
    "${this::class.simpleName} ${id()}"
  abstract fun interact(robot: Robot): Room
  // Makes the exact type of Player object:
  abstract fun makePlayer(room: Room): Player
  // Match the symbol, create and configure
  // a Room with the new Player, or Fail:
  open fun create(ch: Char): Result {
    if (ch == symbol) {
      val room = Room()
      room.player = makePlayer(room)
      return Result.Success(room)
    }
    return Result.Fail
  }
}
// To be continued ...// ... continuing

class Void() : Player() {
  override val symbol = '~'
  override val room: Room
    get() = throw IllegalAccessException()
  override fun makePlayer(room: Room) =
    Void()
  override fun interact(robot: Robot) =
    robot.room // Stay in old room
}

class Wall(
  override val room: Room = Room()
) : Player() {
  override val symbol = '#'
  override fun makePlayer(room: Room) =
    Wall(room)
  override fun interact(robot: Robot) =
    robot.room // Stay in old room
}

class Food(
  override val room: Room = Room()
) : Player() {
  override val symbol = '.'
  override fun makePlayer(room: Room) =
    Food(room)
  override fun interact(robot: Robot): Room {
    robot.energy++ // Consume food
    room.player = Empty(room) // Remove food
    return room // Move into new room
  }
}

class Empty(
  override val room: Room = Room()
) : Player() {
  override val symbol = '_'
  override fun makePlayer(room: Room) =
    Empty(room)
  // Move into new room:
  override fun interact(robot: Robot) = room
}

class EndGame(
  override val room: Room = Room()
) : Player() {
  override val symbol = '!'
  override fun makePlayer(room: Room) =
    EndGame(room)
  override fun interact(robot: Robot) =
    Room(EndGame(room))
}

class Robot(
  override var room: Room = Room()
) : Player() {
  override val symbol = 'R'
  var energy = 0
  override fun makePlayer(room: Room) =
    Robot(room)
  override fun create(ch: Char) =
    if (ch == symbol)
      Result.Success(Room())
    else Result.Fail
  // Shouldn't happen:
  override fun interact(robot: Robot) =
    throw IllegalAccessException()
  fun move(urge: Urge) {
    val nextRoom = room.doors.open(urge)
    room = nextRoom.player.interact(this)
  }
}

class Teleport(
  val target: Char = 'Z',
  override val room: Room = Room()
) : Player() {
  override val symbol = 'T'
  var targetRoom = Room()
  override fun id() = target.toString()
  override fun toString() =
    "${this::class.simpleName} " +
    "$symbol: $target $targetRoom"
  override fun makePlayer(room: Room) =
    throw IllegalStateException()
  override fun create(ch: Char): Result {
    if (ch in 'a'..'z') {
      val room = Room()
      room.player = Teleport(ch, room)
      return Result.Success(room)
    }
    return Result.Fail
  }
  override fun interact(robot: Robot) =
    targetRoom
}

class Bomb(
  override val room: Room = Room()
) : Player() {
  override val symbol = '*'
  override fun makePlayer(room: Room) =
    Bomb(room)
  override fun interact(robot: Robot): Room {
    robot.energy = 0 // Bomb erases energy
    room.player = Empty(room)
    return room
  }
}
