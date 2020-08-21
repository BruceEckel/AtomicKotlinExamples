// LocalFunctions/CustomLabel.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.

fun main() {
  val list = listOf(1, 2, 3, 4, 5)
  val value = 3
  list.forEach tag@{             // [1]
    if (it == value) return@tag  // [2]
  }
  println("This line is called")
}
/* Output:
This line is called
*/
