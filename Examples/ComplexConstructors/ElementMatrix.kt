// ComplexConstructors/ElementMatrix.kt
package complexconstructors
import atomictest.eq

class GameElement(val symbol: Char)

class ElementMatrix(
  val width: Int,                       // [1]
  val height: Int,
  representation: String                // [2]
) {
  val cells = Array(height) {           // [3]
    Array<GameElement?>(width) { null }
  }

  init {                                // [4]
    val lines = representation.lines()  // [5]
    for (y in 0 until height) {
      for (x in 0 until width) {
        val ch = lines[y][x]
        if (ch != ' ') {
          cells[y][x] = GameElement(ch) // [6]
        }
      }
    }
  }

  override fun toString() =
    cells.joinToString("\n") { row ->
      row.joinToString("") { element ->
        "${element?.symbol ?: ' '}"
      }
    }
}

fun main(args: Array<String>) {
  val matrix = ElementMatrix(4, 3, """
    # ##
       #
    #.##
    """.trimIndent())
  matrix.cells[1][1] = GameElement('R')
  matrix.toString() eq """
    # ##
     R #
    #.##
    """.trimIndent()
}
