// ExceptionHandling/CaptureImplementation.kt
package captureimpl
import atomictest.eq

fun capture(f: () -> Unit): String =  // [1]
  try {
    f()                               // [2]
    "Error: Expected an exception"    // [3]
  } catch (e: Throwable) {            // [4]
    "${e::class.simpleName}: ${e.message}"
  }

fun main() {
  capture {
    throw Exception("!!!")
  } eq "Exception: !!!"
  capture {
    1
  } eq "Error: Expected an exception"
}
