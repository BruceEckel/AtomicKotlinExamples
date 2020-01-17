// RobotExplorer2/Players2.kt
package robotexplorer2

open class Player(val symbol: Char) {
  override fun toString() = symbol.toString()
}

class Wall : Player('#')
class Food : Player('.')
class Empty : Player('_')
class Edge : Player('/')
class EndGame : Player('!')

class Robot(var room: Room) : Player('R') {
  fun move(urge: Urge) {
    room = room.doors.open(urge).enter(this)
  }
}

class Teleport(
  val target: Char
) : Player('T') {
  var originRoom = Room()
  var targetRoom = Room()
  override fun toString() = target.toString()
}
