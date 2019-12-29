// ObjectOrientedDesign/Essence.kt
package robotexploreressence
import robotexploreressence.Item.*

enum class Urge { North, South, East, West }

class Robot(var room: Room) {
  fun move(urge: Urge) {
    // Get a reference to the Room you've
    // been urged to go to, and see what
    // happens when we enter that Room.
    // Point robot to returned Room:
    room = room.doors.open(urge).enter(this)
  }
  override fun toString() = "R"
    // "Robot ${room.doors}"
}

enum class Item(val symbol: Char) {
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
  Item.values().forEach {
    if (ch == it.symbol)
      return it
  }
  return Teleport(ch)
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
      // Stay in original room:
      Wall, Edge -> return robot.room
      is Teleport ->
        return (occupant as Teleport)
          .targetRoom
      EndGame -> return Room(EndGame)
      Food -> occupant = Empty // Eat food
      Empty -> {}
    }
    return this // Enter new room
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

class Game(val maze: String) {
  val robot = Robot(Room(Empty))
  private val rooms =
    mutableMapOf<Pair<Int, Int>, Room>()
  fun build(): Game { // 'Builder' pattern
    // Stage 1: Build the rooms
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
    val teleports: List<Room>  = rooms.values
      .filter { it.occupant is Teleport }
      .sortedBy {
        (it.occupant as Teleport).target
      }
    for((a, b) in teleports.zipWithNext()) {
      (a.occupant as Teleport).targetRoom = b
      (b.occupant as Teleport).targetRoom = a
    }
    return this
  }
  fun showRoom(row: Int, col: Int) =
    "($row, $col) " +
      rooms.getOrDefault(Pair(row, col), edge)
  fun showMaze(): String {
    var result = ""
    var currentRow = 0
    rooms.forEach { (pair, room) ->
      val row = pair.first
      if (row != currentRow) {
        result += "\n"
        currentRow = row
      }
      result += if (room == robot.room)
        "$robot" else "${room.occupant}"
    }
    return result
  }
  fun step(urge: Urge? = null) {
    val ansiTerm = "\u001B["
    if(urge != null)
      robot.move(urge)
    print("${ansiTerm}0;0H")
    println(showMaze())
    Thread.sleep(300L)
  }
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
//  print("${ansiTerm}32mHello, World\n")

  val game = Game(stringMaze).build()
  game.step()
//  println(game.showRoom(0, 0))
//  println(game.showRoom(1, 6))
//  println(game.showRoom(5, 0))
//  val robot = game.robot
//  println(robot)
//  robot.move(Urge.East)
//  robot.move(Urge.East)
//  robot.move(Urge.South)
//  println(robot)
}

