// CheckInstructions/CheckInstructionsSoln2.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package checkInstructionsExercise2
import atomictest.*

fun fn(s: String?): String {
  requireNotNull(s)
  require(s.isNotEmpty()) {
    "s must not be empty, is [$s]"
  }
  require(s.isNotBlank()) {
    "s must not be blank, is [$s]"
  }
  val parts = s.split('-')
  require(parts.size == 3 &&
    parts.all { it.isNotEmpty() }) {
    "s must contain 3 parts " +
    "separated by '-', is [$s]"
  }
  return s
}

fun gn(d: Double?): Double {
  requireNotNull(d)
  require(0 < d && d <= 10.0)
  return d
}

fun main() {
  capture { fn(null) } eq
    "IllegalArgumentException: " +
    "Required value was null."
  capture { fn("") } eq
    "IllegalArgumentException: " +
    "s must not be empty, is []"
  capture { fn("   ") } eq
    "IllegalArgumentException: " +
    "s must not be blank, is [   ]"
  capture { fn("abcdef") } eq
    "IllegalArgumentException: " +
    "s must contain 3 parts " +
    "separated by '-', is [abcdef]"
  capture { fn("-abcdef-") } eq
    "IllegalArgumentException: " +
    "s must contain 3 parts " +
    "separated by '-', is [-abcdef-]"
  capture { fn("-abc-def-") } eq
    "IllegalArgumentException: " +
    "s must contain 3 parts " +
    "separated by '-', is [-abc-def-]"
  fn("ab-cd-ef") eq "ab-cd-ef"
  capture { gn(null) } eq
    "IllegalArgumentException: " +
    "Required value was null."
  capture { gn(-0.1) } eq
    "IllegalArgumentException: " +
    "Failed requirement."
  capture { gn(11.0) } eq
    "IllegalArgumentException: " +
    "Failed requirement."
  gn(5.5) eq 5.5
}
