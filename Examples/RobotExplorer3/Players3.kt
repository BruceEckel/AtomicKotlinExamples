// RobotExplorer3/Players3.kt
package robotexplorer3
import robotexplorer.Urge
import kotlin.reflect.full.createInstance

sealed class Player {
  abstract val symbol: Char
  abstract val room: Room
  open fun id() = symbol.toString()
  override fun toString() =
    "${this::class.simpleName} ${id()}"
  open class Result(
    val success: Boolean,
    val room: Room
  )
  class Success(room: Room):
    Result(true, room)
  object Fail: Result(false, Room())
  abstract fun makePlayer(room: Room): Player
  open fun create(ch: Char): Result {
    if (ch == symbol) {
      val room = Room()
      val player = makePlayer(room)
      room.player = player
      return Success(room)
    }
    return Fail
  }
  companion object {
    val prototypes: List<Player> =
      Player::class.sealedSubclasses.map {
        it.createInstance()
      }
    fun factory(ch: Char): Room =
      prototypes.map { it.create(ch) }
        .first { it.success }.room
  }
  abstract fun interact(robot: Robot): Room
}

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
    robot.energy++
    room.player = Empty(room)
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
      Success(Room())
    else Fail
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
  override fun interact(robot: Robot) =
    targetRoom
  override fun create(ch: Char): Result {
    if (ch in 'a'..'z') {
      val room = Room()
      val player = Teleport(ch, room)
      room.player = player
      return Success(room)
    }
    return Fail
  }
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
