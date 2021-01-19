// Visibility/Task4.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package constrainingVisibilityExercise4

fun printSum(x: Int) {
  if (x <= 0) {
    println("Incorrect input: $x should be positive")
    return
  }
  println((0..x).sum())
}

fun main() {
  printSum(-10)
}
/* Output:
Incorrect input: -10 should be positive
*/
