// ExceptionHandling/ExceptHandlingSoln2.kt
package exceptionhandlingsolution2
import atomictest.Trace

private val trace = Trace()

open class DigitFail : Exception()
open class NoDigit : DigitFail()
open class BadDigit : DigitFail()

fun findDigit(s: String): Int {
  for (c in s)
    if (c in "0123456789")
      return c.toInt()
  throw DigitFail()
}

fun embedDigit(n: String) =
  try {
    "AbCdE" + n[0].toInt() + "fGhIj"
  } catch (e: BadDigit) {
    trace(e)
    throw NoDigit()
  }

fun convertDigit(n: String) =
  try {
    n[0].toInt()
  } catch (e: IllegalArgumentException) {
    trace(e)
    throw BadDigit()
  }

fun main() {
  trace eq """

"""
}
