// Visibility/Task5.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package constrainingVisibilityExercise5

fun printSum(x: Int) {
  if (x <= 0) {
    println("Incorrect input: $x should be positive")
    return
  }
  println((0..x).sum())
}

fun printAverage(x: Int) {
  if (x <= 0) {
    println("Incorrect input: $x should be positive")
    return
  }
  println((0..x).average())
}

fun main() {
  printSum(-10)
  printAverage(-10)
}
/* Output:
Incorrect input: -10 should be positive
Incorrect input: -10 should be positive
*/
