// RepetitionWithWhile/WhileLoop.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.

fun condition(i: Int) = i < 100  // [1]

fun main() {
  var i = 0
  while (condition(i)) {
    print(".")
    i += 10         // [2]
  }
}
/* Output:
..........
*/
