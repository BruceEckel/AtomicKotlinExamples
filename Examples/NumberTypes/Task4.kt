// NumberTypes/Task4.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package numberTypesExercise4

fun convertToMilliseconds(hours: Int, minutes: Int, seconds: Int): Long =
  (((hours * 60L + minutes) * 60) + seconds) * 1000

fun main() {
  println(convertToMilliseconds(1, 30, 0))
}
