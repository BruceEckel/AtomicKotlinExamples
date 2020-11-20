// BreakAndContinue/Task1.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package breakAndContinueExercise1

fun readNumbers() {
  var sum = 0
  while (true) {
    val input = readLine()
    val number = input?.toIntOrNull()
    if (number == null) {
      println("Not a number: $input")
    } else {
      sum += number
    }
    if (number == 0) break
  }
  println("Sum: $sum")
}

fun main() {
  readNumbers()
}
/* Input/Output:
>>> 1
>>> a
Not a number: a
>>> 3
>>> 10
>>> 0
Sum: 14
 */
