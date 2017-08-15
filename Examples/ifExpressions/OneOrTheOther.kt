// ifExpressions/OneOrTheOther.kt
fun oneOrTheOther(exp: Boolean): String =
    if (exp) {
      "True!" // No 'return' necessary
    } else {
      "False"
    }

fun main(args: Array<String>) {
  val x = 1
  println(oneOrTheOther(x == 1))
  println(oneOrTheOther(x == 2))
}
/* Output:
True!
False
*/
