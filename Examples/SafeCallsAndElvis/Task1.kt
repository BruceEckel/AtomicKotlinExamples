// SafeCallsAndElvis/Task1.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package safeCallsAndTheElvisOperatorExercise1
import atomictest.eq

fun downcase(s: String?): String =
  s?.lowercase() ?: ""

fun main() {
  downcase(null) eq ""
  downcase("ABC") eq "abc"
}
