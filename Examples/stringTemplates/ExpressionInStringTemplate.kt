// stringTemplates/ExpressionInStringTemplate.kt
fun main(args: Array<String>) {
  val condition = true
  println("${if (condition) 'a' else 'b'}")  // [1]

  val x = 11
  println("$x + 4 = ${x + 4}")
}
/* Output:
a
11 + 4 = 15
*/
