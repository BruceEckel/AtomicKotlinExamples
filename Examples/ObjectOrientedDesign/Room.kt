// ObjectOrientedDesign/Room.kt
package oodesign
import oodesign.Urge.*

class Room(
  val row: Int = 0, val col: Int = 0,
  var agent: Agent = Void()
) {
  val doors = Doors()
  override fun toString() =
    "Room($row, $col, $agent)"
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
    row: Int, col: Int, rooms: List<Room>
  ) {
    fun link(toRow: Int, toCol: Int) =
      rooms.firstOrNull {
        it.row == toRow && it.col == toCol
      } ?: Room.edge
    doors[North] = link(row - 1, col)
    doors[South] = link(row + 1, col)
    doors[East] = link(row, col + 1)
    doors[West] = link(row, col - 1)
  }
}
