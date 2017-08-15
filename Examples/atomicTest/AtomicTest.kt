// atomicTest/AtomicTest.kt
/* A tiny little testing framework, to
display results and to introduce & promote
unit testing early in the learning curve.
To use in your code snippet, include:
import atomicTest.*
*/
package atomicTest

import java.util.*

private fun err(msg: String) {
  println("Error: $msg")
}

private fun <L, R> equals(actual: L, expected: R) {
  if (actual != expected)
    err("$actual != $expected")
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
    err("$this not equal to $value")
}

infix fun <T> Array<T>.eq(value: Array<T>) {
  println(this)
  equals(Arrays.equals(this, value), true)
}

infix fun <T> T.neq(value: T) {
  println(this)
  if (this == value)
    err("$this == $value")
}
