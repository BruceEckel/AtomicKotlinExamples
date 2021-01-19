// Summary2/AtomicTestCapture.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
import atomictest.*

fun main() {
  capture {
    "$1.9".toDouble()
  } eq "NumberFormatException: " +
    """For input string: "$1.9""""
}
