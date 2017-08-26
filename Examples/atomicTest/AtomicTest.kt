// atomicTest/AtomicTest.kt
/* A tiny little testing framework, to
display results and to introduce & promote
unit testing early in the learning curve.
To use in your code, include:
import atomicTest.*
*/
package atomicTest
import java.util.*

private fun <L, R> equals(actual: L, expected: R) {
  if (actual != expected)
    println("Error: $actual != $expected")
}

infix fun <T : Any> T.eq(value: String) {
  println(this)
  equals(value, this.toString())
}

infix fun <T> T.eq(value: T) {
  println(this)
  equals(value, this)
}

infix fun Double.eq(value: Double) {
  println(this)
  val diff = this - value
  if (Math.abs(diff) > 0.0000001)
    println("Error: $this != $value")
}

infix fun <T> Array<T>.eq(value: Array<T>) {
  println(this)
  equals(Arrays.equals(this, value), true)
}

infix fun <T> T.neq(value: T) {
  println(this)
  if (this == value)
    println("Error: $this == $value")
}

// Capture an exception and produce its name:
fun except(f: () -> Unit) =
  try {
    f()
    "Error: Expected an exception"
  } catch(e: Exception) {
    e.toString().split(".", ":")
      .filter { "Exception" in it }
      .first()
  }

/* Usage:
except {
  // code that fails
} eq "FailureException"
*/
