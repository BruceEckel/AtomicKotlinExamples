// ObjectOrientedDesign/Agents.kt
package oodesign

sealed class Agent {
  abstract val symbol: Char
  open fun id() = symbol.toString()
  abstract val room: Room
  override fun toString() =
    "${this::class.simpleName} ${id()}"
  abstract fun interact(robot: Robot): Room
  // Makes the exact type of Agent object:
  abstract fun makeAgent(r: Room): Agent
  // Match the symbol and create + configure
  // a Room with the new Agent, or Fail:
  open fun create(
    ch: Char, row: Int, col: Int): Result {
    if (ch == symbol) {
      val room = Room(row, col)
      room.agent = makeAgent(room)
      return Result.Success(room)
    }
    return Result.Fail
  }
}
// To be continued ...
// ... continuing

class Void() : Agent() {
  override val symbol = '~'
  override val room: Room
    get() = throw IllegalAccessException()
  override fun makeAgent(r: Room) = Void()
  override fun interact(robot: Robot) =
    robot.room // Stay in old room
}

class Wall(
  override val room: Room = Room()
) : Agent() {
  override val symbol = '#'
  override fun makeAgent(r: Room) = Wall(r)
  override fun interact(robot: Robot) =
    robot.room // Stay in old room
}

class Food(
  override val room: Room = Room()
) : Agent() {
  override val symbol = '.'
  override fun makeAgent(r: Room) = Food(r)
  override fun interact(robot: Robot): Room {
    robot.energy++ // Consume food
    room.agent = Empty(room) // Remove food
    return room // Move into new room
  }
}

class Empty(
  override val room: Room = Room()
) : Agent() {
  override val symbol = '_'
  override fun makeAgent(r: Room) = Empty(r)
  // Move into new room:
  override fun interact(robot: Robot) = room
}

class EndGame(
  override val room: Room = Room()
) : Agent() {
  override val symbol = '!'
  override fun makeAgent(r: Room) =
    EndGame(r)
  override fun interact(robot: Robot) =
    Room(0, 0, EndGame(room))
}

class Robot(
  override var room: Room = Room()
) : Agent() {
  override val symbol = 'R'
  var energy = 0
  override fun makeAgent(r: Room) = Robot(r)
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
    room = nextRoom.agent.interact(this)
  }
}

class Teleport(
  val target: Char = 'Z',
  override val room: Room = Room()
) : Agent() {
  override val symbol = 'T'
  var targetRoom = Room()
  override fun id() = target.toString()
  override fun toString() =
    "${this::class.simpleName}: $target" +
    "(${targetRoom.row}, ${targetRoom.col})"
  override fun makeAgent(r: Room) =
    throw IllegalStateException()
  override fun create(
    ch: Char, row: Int, col: Int): Result {
    if (ch in 'a'..'z') {
      val room = Room(row, col)
      room.agent = Teleport(ch, room)
      return Result.Success(room)
    }
    return Result.Fail
  }
  override fun interact(robot: Robot) =
    targetRoom
}

class Bomb(
  override val room: Room = Room()
) : Agent() {
  override val symbol = '*'
  override fun makeAgent(r: Room) = Bomb(r)
  override fun interact(robot: Robot): Room {
    robot.energy = 0 // Bomb erases energy
    room.agent = Empty(room)
    return room
  }
}
