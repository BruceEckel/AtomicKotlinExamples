// NullableTypes/Task2.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package nullableTypesExercise2

fun zilch(): String? = null
fun zilch2(): String? = zilch()

fun main() {
  var x: String? = zilch()
  var y: String? = zilch2()
}
