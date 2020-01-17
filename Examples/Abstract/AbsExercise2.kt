// Abstract/AbsExercise2.kt
package abstractclasses2
import atomictest.*

private val trace = Trace()

enum class Note {
  A, B, C, D, E, F, G
}

abstract class Instrument(val name: String) {
  abstract fun play(n: Note)
}

open class Wind : Instrument("Wind") {
  override fun play(n: Note) {
    trace("$name blow $n")
  }
}

class Percussion : Instrument("Percussion") {
  override fun play(n: Note) {
    trace("$name strike $n")
  }
}

class Stringed : Instrument("Stringed") {
  override fun play(n: Note) {
    trace("$name pluck $n")
  }
}

fun tune(i: Instrument) = i.play(Note.C)

fun main() {
  val orchestra = listOf(
    Wind(),
    Percussion(),
    Stringed()
  )
  orchestra.forEach { tune(it) }
  trace eq """
    Wind blow C
    Percussion strike C
    Stringed pluck C
  """
}
