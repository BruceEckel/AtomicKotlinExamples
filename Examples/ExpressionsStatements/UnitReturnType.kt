// ExpressionsStatements/UnitReturnType.kt

fun unitFun() = Unit

fun main(args: Array<String>) {
  println(unitFun())
  val u1: Unit = println(42)
  println(u1)
  val u2 = println(0) // Type inference
  println(u2)
}
/* Output:
kotlin.Unit
42
kotlin.Unit
0
kotlin.Unit
*/
