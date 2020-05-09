// ExceptionHandling/ExceptHandlingSoln2.kt
package exceptionhandlingsolution2
import atomictest.Trace

private val trace = Trace()

open class NumberFail : Exception()
open class NoNumber : NumberFail()
open class BadNumber : NumberFail()

fun findNumber(s: String): String {
  var result = ""
  for (c in s)
    if (c in "0123456789")
      result += c
    else if (result.isNotEmpty())
      return result
  throw NoNumber()
}

fun convertNumber(s: String): Int =
  try {
    s.toInt()
  } catch (e: NumberFormatException) {
    trace(e)
    throw BadNumber()
  }

fun embedNumber(n: Int) = "AbCdE${n}fGhIj"

fun justFail(s: String) =
  try {
    trace("justFail: [${s}]")
    trace(embedNumber(
      convertNumber(
        findNumber(s))))
  } catch (e: NumberFail) {
    trace(e)
  }

fun recover(s: String): String {
  trace("recover: [${s}]")
  val s1: String = try {
    findNumber(s)
  } catch (e: NoNumber) {
    "0"
  }
  val s2: Int = try {
    convertNumber(s1)
  } catch (e: BadNumber) {
    -1
  }
  return embedNumber(s2)
}

fun main() {
  justFail("The13thFloor9")
  justFail("NoDigitsHere")
  recover("The13thFloor9")
  recover("NoDigitsHere")
  trace eq """
  justFail: [The13thFloor9]
  AbCdE13fGhIj
  justFail: [NoDigitsHere]
  exceptionhandlingsolution2.NoNumber
  recover: [The13thFloor9]
  recover: [NoDigitsHere]
  """
}
