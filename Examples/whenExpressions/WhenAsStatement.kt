// WhenExpressions/WhenAsStatement.kt

fun checkColor(color: String) {
  when(color) {
    "red" -> println("RED")
    "blue" -> println("BLUE")
    "green" -> println("GREEN")
  }
}

fun main(args: Array<String>) {
  checkColor("white")
  checkColor("blue")
}
/* Output:
BLUE
*/
