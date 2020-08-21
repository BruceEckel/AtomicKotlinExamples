// StringTemplates/ExpressionInTemplate.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.

fun main() {
  val condition = true
  println(
    "${if (condition) 'a' else 'b'}")  // [1]
  val x = 11
  println("$x + 4 = ${x + 4}")
}
/* Output:
a
11 + 4 = 15
*/
