// CheckInstructions/RequireNotNull.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package checkinstructions
import atomictest.*

fun notNull(n: Int?): Int {
  requireNotNull(n) {             // [1]
    "notNull() argument cannot be null"
  }
  return n * 9                    // [2]
}

fun main() {
  val n: Int? = null
  capture {
    notNull(n)
  } eq "IllegalArgumentException: " +
    "notNull() argument cannot be null"
  capture {
    requireNotNull(n)             // [3]
  } eq "IllegalArgumentException: " +
    "Required value was null."
  notNull(11) eq 99
}
