// RobotExplorer2/Room2.kt
package robotexplorer2
import robotexplorer1.Urge
import robotexplorer1.Urge.*

class Room(var player: Player = Void()) {
  val doors = Doors()
}

private val edge = Room()

class Doors {
  private val doors = mutableMapOf(
    North to edge,
    South to edge,
    East to edge,
    West to edge
  )
  fun open(urge: Urge): Room =
    doors.getOrDefault(urge, edge)
  fun connect(
    row: Int, col: Int,
    rooms: Map<Pair<Int, Int>, Room>
  ) {
    fun link(toRow: Int, toCol: Int) =
      rooms.getOrDefault(
        Pair(toRow, toCol), edge)
    doors[North] = link(row - 1, col)
    doors[South] = link(row + 1, col)
    doors[East] = link(row, col + 1)
    doors[West] = link(row, col - 1)
  }
}
