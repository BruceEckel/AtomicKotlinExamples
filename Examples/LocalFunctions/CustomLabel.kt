// LocalFunctions/CustomLabel.kt

fun main(args: Array<String>) {
  val list = listOf(1, 2, 3, 4, 5)
  val value = 3
  list.forEach l@{              // [1]
    if (it == value) return@l   // [2]
  }
  println("This line is called")
}
/* Output:
This line is called
*/
