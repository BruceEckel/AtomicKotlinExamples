// ObjectOrientedDesign/Actors.kt
package oodesign

sealed class Actor {
  abstract val symbol: Char
  open fun id() = symbol
  open val room: Room
    get() = throw NotImplementedError()
  override fun toString() =
    "${this::class.simpleName} ${id()}" +
      "(${room.row}, ${room.col})"
  open fun interact(robot: Robot): Room =
    throw NotImplementedError()
  // Makes the exact type of Actor object:
  open fun makeActor(r: Room): Actor =
    throw NotImplementedError()
  // Match the symbol to create & configure
  // a Room with the new Actor, or Fail:
  open
  fun create(ch: Char, row: Int, col: Int) =
    if (ch == symbol) {
      val room = Room(row, col)
      room.actor = makeActor(room)
      Result.Success(room)
    } else Result.Fail
}
// Continued ...
// ... Continuing

class Void() : Actor() {
  override val symbol = '~'
  override fun makeActor(r: Room) = void
  override fun interact(robot: Robot) =
    robot.room // Stay in old room
  companion object {
    val void = Void()
  }
}
// Continued ...
// ... Continuing

class Wall(
  override val room: Room = Room()
) : Actor() {
  override val symbol = '#'
  override fun makeActor(r: Room) = Wall(r)
  override fun interact(robot: Robot) =
    robot.room // Stay in old room
}
// Continued ...
// ... Continuing

class Empty(
  override val room: Room = Room()
) : Actor() {
  override val symbol = '_'
  override fun makeActor(r: Room) = Empty(r)
  // The Robot moves into the new room:
  override fun interact(robot: Robot) = room
}
// Continued ...
// ... Continuing

class Food(
  override val room: Room = Room()
) : Actor() {
  override val symbol = '.'
  override fun makeActor(r: Room) = Food(r)
  override fun interact(robot: Robot): Room {
    robot.energy++ // Consume food
    room.actor = Empty(room) // Remove food
    return room // Move into new room
  }
}
// Continued ...
// ... Continuing

class EndGame(
  override val room: Room = Room()
) : Actor() {
  override val symbol = '!'
  override fun makeActor(r: Room) = EndGame(r)
  override fun interact(robot: Robot) =
    Room(room.row, room.col, EndGame(room))
}
// Continued ...
// ... Continuing

class Robot(
  override var room: Room = Room()
) : Actor() {
  override val symbol = 'R'
  var energy = 0
  override fun makeActor(r: Room) = Robot(r)
  fun move(urge: Urge) {
    val nextRoom = room.doors.open(urge)
    room = nextRoom.actor.interact(this)
  }
}
// Continued ...
// ... Continuing

class Teleport(
  override val symbol: Char = 'T',
  override val room: Room = Room()
) : Actor() {
  var target = Room()
  override fun toString() =
    "${this::class.simpleName}: ${id()}" +
    "(${target.row}, ${target.col})"
  override fun
    create(ch: Char, row: Int, col: Int) =
    if (ch in 'a'..'z') {
      val room = Room(row, col)
      room.actor = Teleport(ch, room)
      Result.Success(room)
    } else Result.Fail
  override fun interact(robot: Robot) = target
}
