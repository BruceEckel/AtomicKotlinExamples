// LocalFunctions/ReturnFromFun.kt

fun main(args: Array<String>) {
  val list = listOf(1, 2, 3, 4, 5)
  val value = 3
  list.forEach {
    if (it == value) return           // [1]
  }
  println("This line is NOT called")  // [2]
}
/* Output:
*/
