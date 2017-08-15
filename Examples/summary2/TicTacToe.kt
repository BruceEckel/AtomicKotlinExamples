// summary2/TicTacToe.kt
import atomicTest.eq

class Cell {
  var entry = ' '                 // [1]
  fun set(e: Char): String =      // [2]
      if (entry == ' ' && (e == 'X' || e == 'O')) {
        entry = e
        "successful move"
      } else
        "invalid move"
}

class Grid {
  val cells = listOf(
      listOf(Cell(), Cell(), Cell()),
      listOf(Cell(), Cell(), Cell()),
      listOf(Cell(), Cell(), Cell())
  )

  fun play(e: Char, x: Int, y: Int): String =
      if (x < 0 || x > 2 || y < 0 || y > 2)
        "invalid move"
      else
        cells[x][y].set(e)        // [3]
}

fun main(args: Array<String>) {
  val grid = Grid()
  grid.play('X', 1, 1) eq "successful move"
  grid.play('X', 1, 1) eq "invalid move"
  grid.play('O', 1, 3) eq "invalid move"
}
