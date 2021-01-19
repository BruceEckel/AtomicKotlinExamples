// RepetitionWithWhile/WhileLoop.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.

fun condition(i: Int) = i < 100  // [1]

fun main() {
  var i = 0
  while (condition(i)) {         // [2]
    print(".")
    i += 10                      // [3]
  }
}
/* Output:
..........
*/
