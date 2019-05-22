// CheckingRequirements/RequireNotNull.kt
package checkingrequirements
import atomictest.*

fun expectingNotNull(n: Int?): Int {
  requireNotNull(n) {
    "n cannot be null"
  }
  return n * 9
}

fun main() {
  val n: Int? = null
  capture {
    expectingNotNull(n)
  } eq "IllegalArgumentException: " +
    "n cannot be null"
  expectingNotNull(11) eq 99
}
