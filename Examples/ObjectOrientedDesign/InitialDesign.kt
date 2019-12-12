// ObjectOrientedDesign/InitialDesign.kt
package oodesigndraft1
import oodesigndraft1.Item.*

enum class Item(val symbol: Char) {
  Mech('R'),
  Wall('#'),
  Food('.'),
  Teleport('T'),
  Empty(' '),
  Edge('_'),
  EndGame('!')
}

enum class Urge { North, South, East, West }

class Robot(var room: Room) {
  fun turn(urge: Urge) {
    // Get a reference to the Room you've
    // been urged to go to, and see what
    // happens when we enter the Room.
    // Point robot to returned Room:
    room =
      room.others.door(urge).enter(this)
  }
  override fun toString() =
    "Robot ${room.others}"
}

val edge = Room(Edge)

class Others {
  var north: Room = edge
  var south: Room = edge
  var east: Room = edge
  var west: Room = edge
  fun connect(
    row: Int, col: Int,
    grid: Map<Pair<Int, Int>, Room>
  ) {
    fun link(toRow: Int, toCol: Int) =
      grid.getOrDefault(
        Pair(toRow, toCol), edge)
    north = link(row - 1, col)
    south = link(row + 1, col)
    east = link(row, col + 1)
    west = link(row, col - 1)
  }
  fun door(urge: Urge): Room =
    when (urge) {
      Urge.North -> north
      Urge.South -> south
      Urge.East -> east
      Urge.West -> west
    }
  override fun toString() =
    "[N(${north.occupant}), " +
    "S(${south.occupant}), " +
    "E(${east.occupant}), " +
    "W(${west.occupant})]"
}

class Room(var occupant: Item = Empty) {
  val others = Others()
  fun enter(r1: Robot): Room {
    when (occupant) {
      Empty -> return this // Enter new room
      // Stay in original room:
      Wall, Edge, Mech -> return r1.room
      Food -> {
        println("Eat food")
        occupant = Empty
        return this
      }
      Teleport -> {
        println("Jump to target room")
        return Room(Teleport)
      }
      EndGame -> {
        println("End game")
        return Room(EndGame)
      }
    }
  }
  override fun toString() =
    "Room($occupant) $others"
}

val stringMaze = """
a ...#... c
R ...#...
###########
a ....... b
###########
! c ..... b
""".trim()

class RoomBuilder(maze: String) {
  private val grid =
    mutableMapOf<Pair<Int, Int>, Room>()
  val robot = Robot(edge) // Nowhere
  init {
    // Stage 1: Create grid
    val lines = maze.split("\n")
    lines.withIndex().forEach { (r, str) ->
      str.withIndex().forEach { (c, ch) ->
        grid[Pair(r, c)] = room(ch)
      }
    }
    // Stage 2: Connect the rooms
    grid.forEach { (p, r) ->
      r.others
        .connect(p.first, p.second, grid)
    }
    // Stage 3: Locate the robot
    robot.room = grid.values
      .find { it.occupant == Mech }
      ?: robot.room
  }
  private fun room(c: Char): Room {
    Item.values().forEach { item ->
      if (item.symbol == c)
        return Room(item)
    }
    return Room(Teleport)
  }
  override fun toString() =
    grid.map { "${it.value}" }
      .joinToString("\n")
}

fun main() {
  val builder = RoomBuilder(stringMaze)
  println(builder)
  println(builder.robot)
}
