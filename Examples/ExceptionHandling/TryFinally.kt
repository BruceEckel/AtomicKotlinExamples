// ExceptionHandling/TryFinally.kt
import atomictest.*

fun tryFinally(i: Int) {
  try {
    println(i)
    if(i > 1)
      throw Exception()
  } finally {
    println("In finally clause for $i")
  }
}

fun main(args: Array<String>) {
  tryFinally(0)
  capture {
    tryFinally(5)
  } eq "Exception"
}
/* Output:
0
In finally clause for 0
5
In finally clause for 5
Exception
*/
