// Abstract/Task3.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package abstractClassesExercise3
import atomictest.trace

enum class Note {
  A, B, C, D, E, F, G
}

open class Instrument(val name: String, val action: String) {
  fun play(n: Note): String = "$name $action $n"
}

class Wind : Instrument("Wind", "blow")

class Percussion : Instrument("Percussion", "strike")

class Stringed : Instrument("Stringed", "pluck")

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
