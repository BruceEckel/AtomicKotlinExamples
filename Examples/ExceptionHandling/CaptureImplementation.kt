// ExceptionHandling/CaptureImplementation.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package exceptionhandling
import atomictest.CapturedException

fun capture(f:() -> Unit): CapturedException =
  try {                                 // [1]
    f()
    CapturedException(null,             // [2]
      "<Error>: Expected an exception")
  } catch (e: Throwable) {              // [3]
    CapturedException(e::class,         // [4]
      if (e.message != null) ": ${e.message}"
      else "")
  }

fun main() {
  capture {
    throw Exception("!!!")
  } eq "Exception: !!!"                 // [5]
  capture {
    1
  } eq "<Error>: Expected an exception"
}
