// LocalFunctions/ReturnFromLambda.kt

fun main(args: Array<String>) {
  val list = listOf(1, 2, 3, 4, 5)
  val value = 3
  list.forEach {
    if (it == value) return@forEach
  }
  println("This line is called")
}
/* Output:
This line is called
*/
