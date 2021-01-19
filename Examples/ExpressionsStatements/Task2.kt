// ExpressionsStatements/Task2.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package expressionsAndStatementsExercise2

fun f(i: Int, j: Int) = i + j

fun g(s1: String, s2: String) = s1 + s2

fun h() = println("h()")

fun main() {
  val fVal: Int = f(1, 2)
  val gVal: String = g("a", "bc")
  val hVal: Unit = h()
  println("Int")
  println("String")
  println("Unit")
}
