// Summary1/Task7.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package summaryIExercise7

fun countDigits(number: Int, digit: Int): Int {
  var worker = number
  var occurrences = 0
  while (worker > 0) {
    if (worker % 10 == digit) {
      occurrences++
    }
    worker /= 10
  }
  return occurrences
}

fun main() {
  println(countDigits(764241, 4)) // 2
}
