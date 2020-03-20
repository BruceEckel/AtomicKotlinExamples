// ObjectOrientedDesign/Factory.kt
package oodesign
import atomictest.eq
import kotlin.reflect.full.createInstance

object Factory {
  val prototypes: List<Actor> =
    Actor::class.sealedSubclasses.map {
      it.createInstance()
    }
  // Keep trying until you produce an object:
  fun make(ch: Char, row: Int, col: Int) =
    prototypes.map { it.create(ch, row, col) }
      .first { it.success }.room
}

fun main() {
  Stage(stringMaze).mazeView() eq stringMaze
}
