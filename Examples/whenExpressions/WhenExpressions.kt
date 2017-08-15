// whenExpressions/WhenExpressions.kt
import atomicTest.eq

fun matchColor(color: String) =
    when (color) {           // [1]
      "red" -> "RED"         // [2]
      "blue" -> "BLUE"
      "green" -> "GREEN"
      else -> "UNKNOWN COLOR: " + color
    }

fun main(args: Array<String>) {
  matchColor("white") eq
      "UNKNOWN COLOR: white"
  matchColor("blue") eq "BLUE"
}
