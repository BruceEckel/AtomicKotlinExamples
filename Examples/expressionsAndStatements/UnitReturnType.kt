// expressionsAndStatements/UnitReturnType.kt
fun g() = Unit

fun main(args: Array<String>) {
  println(g())
  val u: Unit = println(42)
  println(u)
}
/* Output:
kotlin.Unit
42
kotlin.Unit
*/
