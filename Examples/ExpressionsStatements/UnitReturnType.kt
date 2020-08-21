// ExpressionsStatements/UnitReturnType.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.

fun unitFun() = Unit

fun main() {
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
