// ExceptionsHandling/TryFinally.kt
import atomictest.*

fun tryFinally(i: Int) {
  try {
    trace(i)
    if(i > 1)
      throw Exception()
  } finally {
    trace("In finally clause for $i")
  }
}

fun main(args: Array<String>) {
  tryFinally(0)
  capture {
    tryFinally(5)
  } eq "Exception"
  trace eq
"""
0
In finally clause for 0
5
In finally clause for 5
"""
}
