// ObjectOrientedDesign/Room.kt
package robotexplorer
import robotexplorer.Urge.*

class Room(var player: Player = Void()) {
  val doors = Doors()
  override fun toString() = "Room($player)"
  companion object {
    val edge = Room()
  }
}

class Doors {
  private val doors = mutableMapOf(
    North to Room.edge,
    South to Room.edge,
    East to Room.edge,
    West to Room.edge
  )
  fun open(urge: Urge): Room =
    doors.getOrDefault(urge, Room.edge)
  fun connect(
    row: Int, col: Int,
    rooms: Map<Pair<Int, Int>, Room>
  ) {
    fun link(toRow: Int, toCol: Int) =
      rooms.getOrDefault(
        Pair(toRow, toCol), Room.edge)
    doors[North] = link(row - 1, col)
    doors[South] = link(row + 1, col)
    doors[East] = link(row, col + 1)
    doors[West] = link(row, col - 1)
  }
}
