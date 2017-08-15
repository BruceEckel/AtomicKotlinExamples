// repetitionWithWhile/WhileLoop.kt
fun condition(i: Int) = i < 10

fun main(args: Array<String>) {
  var i = 0
  while (condition(i)) {
    print(".")
    i++         // [1]
  }
}
/* Output:
..........
*/
