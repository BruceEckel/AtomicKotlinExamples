// ObjectOrientedDesign/Players.kt
package robotexplorer1

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
