// Summary1/While.kt
// ©2020 Mindview LLC. See Copyright.txt for permissions.

fun testCondition(i: Int) = i < 100

fun main() {
  var i = 0
  while (testCondition(i)) {
    print(".")
    i += 10
  }
}
/* Output:
..........
*/
