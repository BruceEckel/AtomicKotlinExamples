// CheckInstructions/CheckInstructionsSoln1.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package checkinstructionssoln1
import atomictest.*

fun f(s: String): String {
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

fun g(d: Double): Double {
  require(0 < d && d <= 10.0)
  return d
}

fun main() {
  capture { f("") } eq
    "IllegalArgumentException: " +
    "s must not be empty, is []"
  capture { f("   ") } eq
    "IllegalArgumentException: " +
    "s must not be blank, is [   ]"
  capture { f("abcdef") } eq
    "IllegalArgumentException: " +
    "s must contain 3 parts " +
    "separated by '-', is [abcdef]"
  capture { f("-abcdef-") } eq
    "IllegalArgumentException: " +
    "s must contain 3 parts " +
    "separated by '-', is [-abcdef-]"
  capture { f("-abc-def-") } eq
    "IllegalArgumentException: " +
    "s must contain 3 parts " +
    "separated by '-', is [-abc-def-]"
  f("ab-cd-ef") eq "ab-cd-ef"
  capture { g(-0.1) } eq
    "IllegalArgumentException: " +
    "Failed requirement."
  capture { g(11.0) } eq
    "IllegalArgumentException: " +
    "Failed requirement."
  g(5.5) eq 5.5
}
