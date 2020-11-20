// ObjectsEverywhere/Task4.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package objectsEverywhereExercise4

fun reverseDecimal(number: Int): Int = number.toString().reversed().toInt()

fun main() {
  println(reverseDecimal(1234))  // 4321
}
