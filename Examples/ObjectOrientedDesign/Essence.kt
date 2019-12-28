// ObjectOrientedDesign/Essence.kt
package robotexploreressence
import robotexploreressence.Item.*

enum class Item(val symbol: Char) {
//  Mech('R'),
  Wall('#'),
  Food('.'),
//  Teleport('T'),
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
  Item.values().forEach { item ->
    if (item.symbol == ch)
      return item
  }
  return Teleport(ch)
}

enum class Urge { North, South, East, West }

class Robot(var room: Room) {
  fun move(urge: Urge) {
    // Get a reference to the Room you've
    // been urged to go to, and see what
    // happens when we enter that Room.
    // Point robot to returned Room:
    room = room.doors.open(urge).enter(this)
  }
  override fun toString() =
    "Robot ${room.doors}"
}

val edge = Room(Edge)

class Doors {
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
  fun open(urge: Urge): Room =
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

class Room(var occupant: Any = Empty) {
  val doors = Doors()
  fun enter(robot: Robot): Room {
    when (occupant) {
      Empty -> return this // Enter new room
      // Stay in original room:
      Wall, Edge -> return robot.room
      Food -> {
        println("Eat food")
        occupant = Empty
        return this
      }
      is Teleport -> {
        println("Jump to target room")
        return (occupant as Teleport).targetRoom
      }
      EndGame -> {
        println("End game")
        return Room(EndGame)
      }
    }
    return this
  }
  override fun toString() =
    "Room($occupant) $doors"
}

val clearScreen =
  if (System.getProperty("os.name")
      .contains("windows", ignoreCase = true))
    "cls"
  else
    "clear"

class GameBuilder(val maze: String) {
  private val rooms =
    mutableMapOf<Pair<Int, Int>, Room>()
  fun room(row: Int, col: Int) =
    "($row, $col) " +
      rooms.getOrDefault(Pair(row, col), edge)
  val robot = Robot(Room(Empty))
  fun build(): GameBuilder {
    // Stage 1: Build the grid
    val lines = maze.split("\n")
    lines.withIndex().forEach { (r, line) ->
      line.withIndex().forEach { (c, char) ->
        when(val occupant = factory(char)) {
          is Robot ->
            rooms[Pair(r, c)] = robot.room
          else ->
            rooms[Pair(r, c)] = Room(occupant)
        }
      }
    }
    // Stage 2: Connect the rooms
    rooms.forEach { (pair, r) ->
      r.doors.connect(
        pair.first, pair.second, rooms)
    }
    // Stage 3: Connect the Teleport rooms
    rooms.values.filter { it.occupant is Teleport }
    return this
  }
//  private fun createRoom(c: Char): Room {
//    Item.values().forEach { item ->
//      if (item.symbol == c)
//        return Room(item)
//    }
//    return Room(Teleport)
//  }
  override fun toString() =
    rooms.map { "${it.key} ${it.value}" }
      .joinToString("\n")
}

val stringMaze = """
a_...#..._c
R_...#...__
###########
a_......._b
###########
!_c_....._b
""".trim()

val solution = """
eeeenwwww
eeeeeeeeee
wwwwwwww
eeennnwwwwwsseeeeeen
ww
""".trim()

fun main() {
  val builder =
    GameBuilder(stringMaze).build()
  println(builder.room(0, 0))
  println(builder.room(1, 6))
  println(builder.room(5, 0))
  val robot = builder.robot
  println(robot)
  robot.move(Urge.East)
  robot.move(Urge.East)
  robot.move(Urge.South)
  println(robot)
}

