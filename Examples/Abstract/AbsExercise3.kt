// Abstract/AbsExercise3.kt
package abstractclasses3
import atomictest.*

private val trace = Trace()

enum class Note {
  A, B, C, D, E, F, G
}

abstract class Instrument(val name: String) {
  abstract fun play(n: Note)
}

open class Wind(name: String? = null) :
  Instrument(name ?: "Wind") {
  override fun play(n: Note) {
    trace("$name blow $n")
  }
}

open class Percussion(name: String? = null) :
  Instrument(name ?: "Percussion") {
  override fun play(n: Note) {
    trace("$name strike $n")
  }
}

open class Stringed(name: String? = null) :
  Instrument(name ?: "Stringed") {
  override fun play(n: Note) {
    trace("$name pluck $n")
  }
}

class Bowed : Stringed("Bowed") {
  override fun play(n: Note) {
    trace("$name bow $n")
  }
}

class Brass : Wind("Brass")
class Reed : Wind("Reed")

fun tune(i: Instrument) = i.play(Note.C)

fun main() {
  val orchestra = listOf(
    Wind(),
    Percussion(),
    Stringed(),
    Bowed(),
    Brass(),
    Reed()
  )
  orchestra.forEach { tune(it) }
  trace eq """
    Wind blow C
    Percussion strike C
    Stringed pluck C
    Bowed bow C
    Brass blow C
    Reed blow C
  """
}
