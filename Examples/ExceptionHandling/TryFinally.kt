// ExceptionHandling/TryFinally.kt
package exceptionhandling
import atomictest.capture

fun checkValue(value: Int) {
  try {
    println(value)
    if (value <= 0)
      throw IllegalArgumentException(
        "value\n must be positive: $value")
  } finally {
    println("In finally clause for $value")
  }
}

fun main() {
  checkValue(10)
  println(capture {
    checkValue(-10)
  })
}
/* Output:
10
In finally clause for 10
-10
In finally clause for -10
IllegalArgumentException: value
 must be positive: -10
*/
