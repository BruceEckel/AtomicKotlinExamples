// LoopingAndRanges/Task2.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package loopingAndRangesExercise2

fun factorial(n: Int): Long {
  var result = 1L
  for (i in 1..n) {
    result *= i
  }
  return result
}

fun sumOfFactorials(n: Int): Long {
  var result = 0L
  for (i in 1..n) {
    result += factorial(i)
  }
  return result
}

fun main() {
  println(sumOfFactorials(10))  // 4037913
}
