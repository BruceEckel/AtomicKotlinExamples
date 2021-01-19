// LoopingAndRanges/Task1.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package loopingAndRangesExercise1

fun factorial(n: Int): Long {
  var result = 1L
  for (i in 1..n) {
    result *= i
  }
  return result
}

fun main() {
  println(factorial(10))  // 3628800
}
