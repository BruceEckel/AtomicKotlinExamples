// Summary1/While.kt

fun testCondition(i: Int) = i < 100

fun main(args: Array<String>) {
  var i = 0
  while (testCondition(i)) {
    print(".")
    i += 10
  }
}
/* Output:
..........
*/
