// HigherOrderFunctions/Task4.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package higherOrderFunctionsExercise4

fun <A, B, C> ((A) -> B).andThen(action: (B) -> C): (A) -> C =
  { a: A -> action(this(a)) }

fun main() {
  val multiply2: (Int) -> Int = { x: Int -> x * 2 }
  val println: (Int) -> Unit = { i: Int -> println("Result: $i") }

  val composition = multiply2.andThen(println)
  composition(5)
}
/* Output:
Result: 10
*/
