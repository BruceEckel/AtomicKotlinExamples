// InKeyword/IterationVsMembership.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.

fun main() {
  val values = 1..3
  for (v in values) {
    println("iteration $v")
  }
  val v = 2
  if (v in values)
    println("$v is a member of $values")
}
/* Output:
iteration 1
iteration 2
iteration 3
2 is a member of 1..3
*/
