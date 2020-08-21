// WhenExpressions/AnalyzeInput.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.

class Coordinates(var x: Int, var y: Int) {
  override fun toString(): String {
    return "($x, $y)"
  }
}

fun readInput() {
  println("""|Welcome! Type 'up', 'down',
    |'left', 'right' or 'nowhere' to move;
    |'exit' to exit.""".trimMargin())
  val coordinates = Coordinates(0, 0)
  while (true) {
    println("Your coordinates: $coordinates")
    println("Where do you want to move?")
    when (readLine()) {                // [1]
      "up", "u" -> coordinates.y--     // [2]
      "down", "d" -> coordinates.y++
      "left", "l" -> coordinates.x--
      "right", "r" -> {                // [3]
        coordinates.x++
      }
      "nowhere" -> {}                  // [4]
      "exit" -> return                 // [5]
      else -> println("Sorry, " +
        "I don't understand you")
    }
  }
}

fun main() {
  readInput()
}
/* Input/Output:
Welcome! Type 'up', 'down',
'left', 'right' or 'nowhere' to move;
'exit' to exit.
Your coordinates: (0, 0)
Where do you want to move?
>>> right
Your coordinates: (1, 0)
Where do you want to move?
>>> d
Your coordinates: (1, 1)
Where do you want to move?
>>> nowhere
Your coordinates: (1, 1)
Where do you want to move?
>>> exit
*/
