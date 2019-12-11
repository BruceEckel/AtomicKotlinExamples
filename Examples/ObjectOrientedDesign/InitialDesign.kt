// ObjectOrientedDesign/InitialDesign.kt
package oodesigndraft1

interface Item
class Wall: Item
class Food: Item
class Teleport(val destination: Room) : Item
class EndGame: Item
class Empty: Item
class Boundary: Item

enum class Urge {
  North, South, East, West
}

class Robot(var room: Room) {
  fun turn(urge: Urge) {
    // Get a reference to the Room you've
    // been urged to go to, and see what
    // happens when we enter the Room.
    // Point Robot to returned Room:
    room = room.next(urge).enter(this)
  }
}

val boundary = Room(Boundary())
// Indicates the game is ending:
val endSentinel = Room()

class Room(var occupant: Item = Empty()) {
  val north: Room = boundary
  val south: Room = boundary
  val east: Room  = boundary
  val west: Room  = boundary
  fun next(urge: Urge): Room =
    when(urge) {
      Urge.North -> north
      Urge.South -> south
      Urge.East  -> east
      Urge.West  -> west
    }
  fun enter(robot: Robot): Room {
    when (val e = occupant) {
      is Empty -> {}
      is Boundary -> {
        println("Hit Boundary")
        // Stay in original room:
        return robot.room
      }
      is Wall -> {
        println("Bounce off wall")
        // Stay in original room:
        return robot.room
      }
      is Food -> {
        println("Eat food")
        occupant = Empty()
      }
      is Teleport -> {
        println("Jump to target room")
        return e.destination
      }
      is EndGame -> {
        println("End game")
        return endSentinel
      }
      else -> println("???")
    }
    return this
  }
}

fun main() {}
