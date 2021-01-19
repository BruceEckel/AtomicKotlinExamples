// BreakAndContinue/Task1.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package breakAndContinueExercise1
import atomictest.*

fun readNumbers(vararg n: String) {
  var sum = 0
  for (input in n) {
    val number = input.toIntOrNull()
    if (number == null) {
      trace("Not a number: $input")
    } else {
      sum += number
    }
    if (number == 0) break
  }
  trace("Sum: $sum")
}

fun main() {
  readNumbers("1", "a", "3", "10", "0", "19")
  trace eq """
    Not a number: a
    Sum: 14
  """
}
