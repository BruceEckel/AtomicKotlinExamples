// RobotExplorer1/Urge.kt
package robotexplorer1
import robotexplorer1.Urge.*

enum class Urge { North, South, East, West }

fun urge(urgeChar: Char): Urge =
  when (urgeChar) {
    'n' -> North
    's' -> South
    'e' -> East
    'w' -> West
    else -> West
  }
