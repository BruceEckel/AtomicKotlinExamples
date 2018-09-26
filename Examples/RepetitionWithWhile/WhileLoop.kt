// RepetitionWithWhile/WhileLoop.kt

fun condition(i: Int) = i < 100

fun main() {
  var i = 0
  while (condition(i)) {
    print(".")
    i += 10       // [1]
  }
}
/* Output:
..........
*/
