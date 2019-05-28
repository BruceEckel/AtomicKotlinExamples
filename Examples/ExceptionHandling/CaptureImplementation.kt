// ExceptionHandling/CaptureImplementation.kt
package exceptionhandling
import atomictest.eq

fun capture(f: () -> Unit): String =
  try {
    f()
    "Expected an exception"
  } catch (e: Exception) {
    e::class.simpleName +
      (e.message?.let { ": $it" } ?: "")
  }

fun main() {
  capture {
    "1$".toInt()
  } eq "NumberFormatException: " +
    """For input string: "1$""""
  capture {
    "1".toInt()
  } eq "Expected an exception"
}
