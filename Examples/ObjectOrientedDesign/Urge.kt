// ObjectOrientedDesign/Urge.kt
package robotexplorer
import robotexplorer.Urge.*

enum class Urge { North, South, East, West }

fun urge(urgeChar: Char): Urge =
  when (urgeChar) {
    'n' -> North
    's' -> South
    'e' -> East
    'w' -> West
    else -> throw IllegalStateException(
      "Bad urgeChar $urgeChar")
  }
