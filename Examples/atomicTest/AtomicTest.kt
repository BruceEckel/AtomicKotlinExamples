// AtomicTest/AtomicTest.kt
/* A tiny little testing framework, to
display results and to introduce & promote
unit testing early in the learning curve.
To use in your code, include:
import atomictest.*
*/
package atomictest
import java.util.*
import java.io.*

private fun <L, R>
equals(actual: L, expected: R) {
  if (actual != expected)
    println("[Error]: $actual != $expected")
}

// Removes all whitespace, to allow for
// embedded linefeeds & indentation:
infix fun <T: Any> T.eq(rv: String) {
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
  } catch(e: Throwable) {
    e.javaClass.simpleName
  }

/* Usage:
capture {
  // Code that fails
} eq "FailureException"
*/

// Capture a stack trace for comparison:
fun stacktrace(f: () -> Unit): String =
  try {
    f()
    "[Error]: Expected an exception"
  } catch(e: Throwable) {
    val trace = StringWriter()
    e.printStackTrace(PrintWriter(trace))
    trace.toString()
  }

/* Usage:
stacktrace {
  // Code that fails
} eq
"""
(stack trace)
"""
*/

// Capture first line of stack trace,
// and extract just the essence:
fun stacktrace1(f: () -> Unit): String =
  try {
    f()
    "[Error]: Expected an exception"
  } catch(e: Throwable) {
    val name = e.javaClass.simpleName
    val trace = StringWriter()
    e.printStackTrace(PrintWriter(trace))
    trace.toString().lines()
      .first().replaceBefore(":", name)
  }


// Add messages via trace(msg), to be later
// validated with:
// trace.result eq "(trace contents)"
object trace {
  private var result = ""
  operator fun invoke(msg: Any) {
    result += msg.toString() + "\n"
  }
  fun reset() {
    result = ""
  }
  infix fun eq(msg: String) = result eq msg
}
