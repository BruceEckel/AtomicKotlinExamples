// ObjectOrientedDesign/InitializeMaze.kt
package oodesigndraft1

val stringMaze = """
a ...#... c
R ...#...
###########
a ....... b
###########
! c ..... b
###########
""".strip()

fun createGrid(maze: String): MutableMap<Pair<Int, Int>, Char> {
  val grid = mutableMapOf<Pair<Int, Int>, Char>()
  for((row, s) in maze.split("\n").withIndex())
    for ((column, c) in s.withIndex())
      grid[Pair(row, column)] = c
  return grid
}

fun main() {
  println(createGrid(stringMaze))
}
