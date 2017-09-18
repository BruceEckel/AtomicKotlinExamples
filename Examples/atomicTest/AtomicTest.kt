// AtomicTest/AtomicTest.kt
/* A tiny little testing framework, to
display results and to introduce & promote
unit testing early in the learning curve.
To use in your code, include:
import atomictest.*
*/
package atomictest
import java.util.*

private fun <L, R> equals(actual: L, expected: R) {
  if (actual != expected)
    println("[Error]: $actual != $expected")
}

infix fun <T: Any> T.eq(value: String) {
  val s = this.toString()
  println(s)
  if(s.compareTo(value) != 0) {
    println("[Error]: \n[$s]\n!=\n[$value]")
    // println(s.toList())
    // println(value.toList())
  }
}

// Character equals: removes all whitespace
infix fun <T: Any> T.ceq(rv: String) {
  val rws = "\\s".toRegex()
  val lval = this.toString().replace(rws, "")
  val rval = rv.toString().replace(rws, "")
  println(this.toString())
  if(lval.compareTo(rval) != 0)
    println("[Error]: \n[$lval]\n!=\n[$rval]")
}

infix fun <T> T.eq(value: T) {
  println(this)
  equals(value, this)
}

infix fun Double.eq(value: Double) {
  println(this)
  val diff = this - value
  if (Math.abs(diff) > 0.0000001)
    println("[Error]: $this != $value")
}

infix fun <T> Array<T>.eq(value: Array<T>) {
  println(this)
  equals(Arrays.equals(this, value), true)
}

infix fun <T> T.neq(value: T) {
  println(this)
  if (this == value)
    println("[Error]: $this == $value")
}

// Capture an exception and produce its name:
fun capture(f: () -> Unit): String =
  try {
    f()
    "[Error]: Expected an exception"
  } catch(e: Exception) {
    e.javaClass.simpleName
  }

/* Usage:
capture {
  // Code that fails
} eq "FailureException"
*/
