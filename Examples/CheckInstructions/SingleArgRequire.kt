// CheckInstructions/SingleArgRequire.kt
// ©2020 Mindview LLC. See Copyright.txt for permissions.
package checkinstructions
import atomictest.*

fun singleArgRequire(arg: Int): Int {
  require(arg > 5)
  return arg
}

fun main() {
  capture {
    singleArgRequire(5)
  } eq "IllegalArgumentException: " +
    "Failed requirement."
  singleArgRequire(6) eq 6
}
