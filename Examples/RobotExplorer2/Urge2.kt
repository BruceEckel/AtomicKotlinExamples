// RobotExplorer2/Urge2.kt
package robotexplorer2
import robotexplorer2.Urge.*

enum class Urge { North, South, East, West }

fun urge(urgeChar: Char): Urge =
  when (urgeChar) {
    'n' -> North
    's' -> South
    'e' -> East
    'w' -> West
    else -> West
  }
