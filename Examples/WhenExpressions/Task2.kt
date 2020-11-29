// WhenExpressions/Task2.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package whenExpressionsExercise2
import atomictest.eq

fun temperature(temperature: Int): String =
  when {
    temperature >= 25 -> "Hot"
    temperature in 15..24 -> "Warm"
    temperature in 5..14 -> "Cool"
    temperature in -5..4 -> "Cold"
    else -> "Freezing"
  }

fun main() {
  temperature(30) eq "Hot"
  temperature(10) eq "Cool"
  temperature(-30) eq "Freezing"
}
