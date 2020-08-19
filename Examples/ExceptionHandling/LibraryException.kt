// ExceptionHandling/LibraryException.kt
// ©2020 Mindview LLC. See Copyright.txt for permissions.
package exceptionhandling
import atomictest.*

fun testCode(code: Int) {
  if (code <= 1000) {
    throw IllegalArgumentException(
      "Code must be > 1000: $code")
  }
}

fun main() {
  try {
    // A1 is 161 in base-16 (hex) notation:
    testCode("A1".toInt(16))
  } catch (e: IllegalArgumentException) {
    e.message eq
      "Code must be > 1000: 161"
  }
  try {
    testCode("0".toInt(1))
  } catch (e: IllegalArgumentException) {
    e.message eq
      "radix 1 was not in valid range 2..36"
  }
}
