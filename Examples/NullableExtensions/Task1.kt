// NullableExtensions/Task1.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package extensionsForNullableTypesExercise1
import atomictest.eq

fun String?.orEmpty(): String = this ?: ""

fun main() {

  null.orEmpty() eq ""

  "abc".orEmpty() eq "abc"
}
