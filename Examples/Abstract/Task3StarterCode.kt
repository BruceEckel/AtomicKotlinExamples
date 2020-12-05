// Abstract/Task3StarterCode.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package abstractClassesExercise3StarterCode
import atomictest.trace

enum class Note {
  A, B, C, D, E, F, G
}

abstract class Instrument {
  abstract fun play(n: Note): String
}

class Wind : Instrument() {
  override fun play(n: Note) =
    "Wind blow $n"
}

class Percussion : Instrument() {
  override fun play(n: Note) =
    "Percussion strike $n"
}

class Stringed : Instrument() {
  override fun play(n: Note) =
    "Stringed pluck $n"
}

fun tune(i: Instrument) = i.play(Note.C)

fun main() {
  val orchestra = listOf(
    Wind(),
    Percussion(),
    Stringed()
  )
  for (instrument in orchestra) {
    trace(tune(instrument))
  }
  trace eq """
    Wind blow C
    Percussion strike C
    Stringed pluck C
  """
}
