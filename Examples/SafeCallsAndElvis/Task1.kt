// SafeCallsAndElvis/Task1.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package safeCallsAndTheElvisOperatorExercise1
import atomictest.eq

fun downcase(s: String?): String =
  s?.toLowerCase() ?: ""

fun main() {
  downcase(null) eq ""
  downcase("ABC") eq "abc"
}
