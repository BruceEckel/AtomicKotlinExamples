// Summary1/While.kt

fun test_condition(i: Int) = i < 100

fun main(args: Array<String>) {
  var i = 0
  while (test_condition(i)) {
    print(".")
    i += 10
  }
}
/* Output:
..........
*/
