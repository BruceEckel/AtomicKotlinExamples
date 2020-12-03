// NullableExtensions/Task2.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package extensionsForNullableTypesExercise2
import atomictest.eq

fun Boolean?.and(that: Boolean?): Boolean? =
  if (this != null && that != null) this && that else null

fun Boolean?.or(that: Boolean?): Boolean? =
  if (this != null && that != null) this || that else null

fun main() {
  val b = true
  b.and(null) eq null
  null.or(b) eq null
  b.or(false) eq true
}
