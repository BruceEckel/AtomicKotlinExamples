// Enumerations/Direction.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package enumerations
import atomictest.eq
import enumerations.Direction.*

enum class Direction(val notation: String) {
  North("N"), South("S"),
  East("E"), West("W");  // Semicolon required
  val opposite: Direction
    get() = when (this) {
      North -> South
      South -> North
      West -> East
      East -> West
    }
}

fun main() {
  North.notation eq "N"
  North.opposite eq South
  West.opposite.opposite eq West
  North.opposite.notation eq "S"
}
