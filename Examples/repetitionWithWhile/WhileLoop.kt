// RepetitionWithWhile/WhileLoop.kt

fun condition(i: Int) = i < 100

fun main(args: Array<String>) {
  var i = 0
  while (condition(i)) {
    print(".")
    i += 10     // [1]
  }
}
/* Output:
..........
*/
