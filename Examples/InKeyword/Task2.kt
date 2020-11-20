// InKeyword/Task2.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package theInKeywordExercise2

fun sumOfEven(n: Int): Int {
  var result = 0
  for (i in 0..n step 2) {
    result += i
  }
  return result
}

fun main() {
  println(sumOfEven(10))  // 30
}
