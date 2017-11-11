// ExpressionsAndStatements/UnitReturnType.kt

fun foo() = Unit

fun main(args: Array<String>) {
  println(foo())
  val u: Unit = println(42)
  println(u)
}
/* Output:
kotlin.Unit
42
kotlin.Unit
*/
