// IfExpressions/If4.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.

fun main() {
  val n: Int = -11
  if (n > 0)
    println("It's positive")
  else if (n == 0)
    println("It's zero")
  else
    println("It's negative")
}
/* Output:
It's negative
*/
