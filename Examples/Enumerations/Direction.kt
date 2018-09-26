// Enumerations/Direction.kt
package enumerations
import atomictest.eq
import enumerations.Direction.*

enum class Direction(val notation: String) {
  NORTH("N"), SOUTH("S"),
  EAST("E"), WEST("W");
  val opposite: Direction
    get() = when (this) {
      NORTH -> SOUTH
      SOUTH -> NORTH
      WEST -> EAST
      EAST -> WEST
    }
}

fun main() {
  NORTH.notation eq "N"
  NORTH.opposite eq SOUTH
  WEST.opposite.opposite eq WEST
  NORTH.opposite.notation eq "S"
}
