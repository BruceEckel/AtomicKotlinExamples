// ExceptionHandling/TryFinally.kt
package exceptionhandling
import atomictest.*

private val trace = Trace()

fun checkValue(value: Int) {
  try {
    trace(value)
    if (value <= 0)
      throw IllegalArgumentException(
        "value must be positive: $value")
  } finally {
    trace("In finally clause for $value")
  }
}

fun main() {
  listOf(10, -10).forEach {
    try {
      checkValue(it)
    } catch (e: IllegalArgumentException) {
      trace("In catch clause for main()")
      trace(e.message)
    }
  }
  trace eq """
  10
  In finally clause for 10
  -10
  In finally clause for -10
  In catch clause for main()
  value must be positive: -10
  """
}
