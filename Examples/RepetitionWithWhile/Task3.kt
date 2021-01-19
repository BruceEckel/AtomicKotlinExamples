// RepetitionWithWhile/Task3.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package repetitionWithWhileExercise3

fun sumOfEven(n: Int): Int {
  var result = 0
  var i = 0
  while (i <= n) {
    if (i % 2 == 0) {
      result += i
    }
    i++
  }
  return result
}

fun main() {
  println(sumOfEven(10))  // 30
}
