// ObjectOrientedDesign/Players.kt
package oodesign

sealed class Player {
  abstract val symbol: Char
  open fun id() = symbol.toString()
  abstract val room: Room
  override fun toString() =
    "${this::class.simpleName} ${id()}"
  abstract fun interact(robot: Robot): Room
  // Makes the exact type of Player object:
  abstract fun makePlayer(r: Room): Player
  // Match the symbol and create + configure
  // a Room with the new Player, or Fail:
  open fun create(
    ch: Char, row: Int, col: Int): Result {
    if (ch == symbol) {
      val room = Room(row, col)
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
  override fun makePlayer(r: Room) = Void()
  override fun interact(robot: Robot) =
    robot.room // Stay in old room
}

class Wall(
  override val room: Room = Room()
) : Player() {
  override val symbol = '#'
  override fun makePlayer(r: Room) = Wall(r)
  override fun interact(robot: Robot) =
    robot.room // Stay in old room
}

class Food(
  override val room: Room = Room()
) : Player() {
  override val symbol = '.'
  override fun makePlayer(r: Room) = Food(r)
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
  override fun makePlayer(r: Room) = Empty(r)
  // Move into new room:
  override fun interact(robot: Robot) = room
}

class EndGame(
  override val room: Room = Room()
) : Player() {
  override val symbol = '!'
  override fun makePlayer(r: Room) =
    EndGame(r)
  override fun interact(robot: Robot) =
    Room(0, 0, EndGame(room))
}

class Robot(
  override var room: Room = Room()
) : Player() {
  override val symbol = 'R'
  var energy = 0
  override fun makePlayer(r: Room) = Robot(r)
  override fun create(
    ch: Char, row: Int, col: Int): Result =
    if (ch == symbol)
      Result.Success(Room(row, col))
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
    "$symbol: $target" //  $targetRoom
  override fun makePlayer(r: Room) =
    throw IllegalStateException()
  override fun create(
    ch: Char, row: Int, col: Int): Result {
    if (ch in 'a'..'z') {
      val room = Room(row, col)
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
  override fun makePlayer(r: Room) = Bomb(r)
  override fun interact(robot: Robot): Room {
    robot.energy = 0 // Bomb erases energy
    room.player = Empty(room)
    return room
  }
}
