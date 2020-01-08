// ObjectOrientedDesign/Players.kt
package robotexplorer1
import robotexplorer1.Player.*
import robotexplorer1.Urge.*

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
  var originRoom = Room()
  var targetRoom = Room()
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

fun factory2(ch: Char, room: Room, robot: Robot) {
  if(ch == 'R') {
    robot.room = room
    return
  }
  Player.values().forEach {
    if (ch == it.symbol) {
      room.player = it
      return
    }
  }
  val teleport = Teleport(ch)
  room.player = teleport
  teleport.originRoom = room
}
