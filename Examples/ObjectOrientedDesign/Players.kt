// ObjectOrientedDesign/Players.kt
package robotexplorer1
import robotexplorer1.Player.*

enum class Urge { North, South, East, West }

fun urge(urgeChar: Char): Urge =
  when (urgeChar) {
    'n' -> Urge.North
    's' -> Urge.South
    'e' -> Urge.East
    'w' -> Urge.West
    else -> Urge.West
  }

class Robot(var room: Room) {
  fun move(urge: Urge) {
    // Get a reference to the Room you've
    // been urged to go to, and see what
    // happens when we enter that Room.
    // Point robot to returned Room:
    room = room.doors.open(urge).enter(this)
  }
  override fun toString() = "R"
}

enum class Player(val symbol: Char) {
  Wall('#'),
  Food('.'),
  Empty('_'),
  Edge('/'),
  EndGame('!');
  override fun toString() = symbol.toString()
}

class Teleport(val target: Char) {
  var targetRoom = Room(Empty)
  override fun toString() = target.toString()
}

fun factory(ch: Char): Any {
  if(ch == 'R')
    return Robot(edge)
  Player.values().forEach {
    if (ch == it.symbol)
      return it
  }
  return Teleport(ch)
}
