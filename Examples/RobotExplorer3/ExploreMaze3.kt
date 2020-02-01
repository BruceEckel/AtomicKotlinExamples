// RobotExplorer3/ExploreMaze3.kt
package robotexplorer3
import robotmaze.*

fun testFactory(maze: String) {
  println(Player.prototypes.map {
    it.javaClass.simpleName
  })
  val lines = maze.split("\n")
  lines.withIndex().forEach { (row, line) ->
    line.withIndex().forEach { (col, ch) ->
      println(Player.factory(ch))
    }
  }
}

fun main() {
  // testFactory(stringMaze)
  Stage(stringMaze).run(solution)
}
