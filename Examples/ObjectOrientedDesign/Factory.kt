// ObjectOrientedDesign/Factory.kt
package robotexplorer
import kotlin.reflect.full.createInstance

object Factory {
  val prototypes: List<Player> =
    Player::class.sealedSubclasses.map {
      it.createInstance()
    }
  // Go through the list, attempting to
  // create an object, until you succeed:
  fun create(ch: Char): Room =
    prototypes.map { it.create(ch) }
      .first { it.success }.room
}

fun testFactory(maze: String) {
  println(Factory.prototypes.map {
    it::class.simpleName
  })
  val lines = maze.split("\n")
  lines.withIndex().forEach { (row, line) ->
    line.withIndex().forEach { (col, ch) ->
      println(Factory.create(ch))
    }
  }
}

fun main() {
  testFactory(stringMaze)
}
