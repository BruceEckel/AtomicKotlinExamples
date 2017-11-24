// WhenExpressions/WhenAsStatement.kt
import atomictest.*

fun checkColor(color: String) {
  when(color) {
    "red" -> trace("RED")
    "blue" -> trace("BLUE")
    "green" -> trace("GREEN")
  }
}

fun main(args: Array<String>) {
  checkColor("white")
  checkColor("blue")
  trace eq "BLUE"
}
