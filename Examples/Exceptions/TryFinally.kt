// exceptions/TryFinally.kt
import atomictest.*

fun tryFinally(i: Int) {
  var s = "Untouched"
  try {
    if(i > 1)
      throw Exception()
  } finally {
    s = "In finally clause for $i"
    s eq "In finally clause for $i"
  }
}

fun main(args: Array<String>) {
  tryFinally(0)
  capture {
    tryFinally(5)
  } eq "Exception"
}
/* Output:
In finally clause for 0
In finally clause for 5
Exception
*/