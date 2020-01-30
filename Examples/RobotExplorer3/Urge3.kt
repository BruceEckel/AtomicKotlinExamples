// RobotExplorer3/Urge3.kt
package robotexplorer3
import robotexplorer3.Urge.*

enum class Urge { North, South, East, West }

fun urge(urgeChar: Char): Urge =
  when (urgeChar) {
    'n' -> North
    's' -> South
    'e' -> East
    'w' -> West
    else -> West
  }
