// NumberTypes/Task3.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package numberTypesExercise3

fun convertFahrenheitToCelsius(f: Int): Double =
  (f - 32) * 5.0 / 9

fun convertCelsiusToFahrenheit(c: Int): Double =
  c * 9.0 / 5 + 32

fun main() {
  println(convertFahrenheitToCelsius(68)) // 20.0
  println(convertCelsiusToFahrenheit(20)) // 68.0
}
