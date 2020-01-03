// Abstract/AbsExercise1.kt
package abstractclasses
import abstractclasses.Note.*
import atomictest.eq

private var trace = ""

enum class Note {
  A, B, C, D, E, F, G
}

abstract class Instrument {
  private val i = 0
  abstract fun play(n: Note)
  open fun what() = "Instrument"
  abstract fun adjust()
}

open class Wind : Instrument() {
  override fun play(n: Note) {
    print("Wind.play() $n")
  }
  override fun what() = "Wind"
  override fun adjust() {}
}

class Percussion : Instrument() {
  override fun play(n: Note) {
    print("Percussion.play() $n")
  }
  override fun what() = "Percussion"
  override fun adjust() {}
}

class Stringed : Instrument() {
  override fun play(n: Note) {
    print("Stringed.play() $n")
  }
  override fun what() = "Stringed"
  override fun adjust() {}
}

class Brass : Wind() {
  override fun play(n: Note) {
    print("Brass.play() $n")
  }
  override fun adjust() {
    print("Brass.adjust()")
  }
}

class Woodwind : Wind() {
  override fun play(n: Note) {
    print("Woodwind.play() $n")
  }
  override fun what() = "Woodwind"
}

fun tune(i: Instrument) = i.play(C)

fun tuneAll(e: Array<Instrument>) {
  for (i in e) tune(i)
}

fun main() {
  val orchestra = arrayOf(
    Wind(),
    Percussion(),
    Stringed(),
    Brass(),
    Woodwind()
  )
  tuneAll(orchestra)
  trace eq ""
}
