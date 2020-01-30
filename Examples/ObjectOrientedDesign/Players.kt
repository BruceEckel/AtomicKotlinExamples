// ObjectOrientedDesign/Players.kt
package robotexplorer

class Robot(var room: Room) {
  val symbol = 'R'
  fun move(urge: Urge) {
    // Get a reference to the Room you've
    // been urged to go to, and see what
    // happens when we enter that Room.
    // Point robot to returned Room:
    room = room.doors.open(urge).enter(this)
  }
  override fun toString() = symbol.toString()
}

enum class Player(val symbol: Char) {
  Wall('#'),
  Food('.'),
  Empty('_'),
  Void('~'),
  EndGame('!');
  override fun toString() = symbol.toString()
}

class Teleport(val target: Char) {
  var originRoom = Room()
  var targetRoom = Room()
  override fun toString() = target.toString()
}

fun factory(ch: Char): Room {
  val room = Room()
  Player.values().forEach {
    if (ch == it.symbol) {
      room.player = it
      return room
    }
  }
  val teleport = Teleport(ch)
  room.player = teleport
  teleport.originRoom = room
  return room
}
