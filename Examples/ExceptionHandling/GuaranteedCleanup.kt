// ExceptionHandling/GuaranteedCleanup.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package exceptionhandling
import atomictest.eq

data class Switch(
  var on: Boolean = false,
  var result: String = "OK"
)

fun testFinally(i: Int): Switch {
  val sw = Switch()
  try {
    sw.on = true
    when (i) {
      0 -> throw IllegalStateException()
      1 -> return sw                 // [1]
    }
  } catch (e: IllegalStateException) {
    sw.result = "exception"
  } finally {
    sw.on = false
  }
  return sw
}

fun main() {
  testFinally(0) eq
    "Switch(on=false, result=exception)"
  testFinally(1) eq
    "Switch(on=false, result=OK)"    // [2]
  testFinally(2) eq
    "Switch(on=false, result=OK)"
}
