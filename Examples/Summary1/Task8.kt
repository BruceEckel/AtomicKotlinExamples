// Summary1/Task8.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package summaryIExercise8

fun reverseDecimal(number: Int): Int {
  var worker = number
  var result = 0

  while (worker > 0) {
    result += worker % 10
    worker /= 10
    if (worker != 0) {
      result *= 10
    }
  }
  return result
}

fun main() {
  println(reverseDecimal(1234))  // 4321
}
