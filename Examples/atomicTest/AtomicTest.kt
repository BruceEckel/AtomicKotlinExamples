// AtomicTest/AtomicTest.kt
/* A minimal test framework for the book, to
display results and introduce & promote unit
testing early in the learning curve.
*/
package atomictest
import java.util.*
import java.io.*

private val errTag = "[Error]:"
private val expectedException =
  "$errTag Expected an exception"

private fun <L, R> test(display: String,
  actual: L, expected: R,
  failTest: () -> Boolean,
  altMsg: String = "") {
  println(display)
  if(failTest())
    if(altMsg == "")
      println("$errTag $actual != $expected")
    else
      println(altMsg)
}

// Compare as Strings. Removes all whitespace
// to allow embedded linefeeds & indentation:
infix fun <T: Any> T.eq(rv: String) {
  val rws = "\\s".toRegex()
  val lval = this.toString().replace(rws, "")
  val rval = rv.toString().replace(rws, "")
  test(this.toString(), lval, rval,
    { lval.compareTo(rval) != 0 })
}

infix fun <T> T.eq(value: T) {
  test(this.toString(), this, value,
    { this != value })
}

/* Unused:
infix fun <T> Array<T>.eq(value: Array<T>) {
  test(this.toString(), this, value,
    { Arrays.equals(this, value) })
}
*/

infix fun Double.eq(value: Double) {
  test(this.toString(), this, value,
    { Math.abs(this - value) > 0.0000001 })
}

infix fun <T> T.neq(value: T) {
  test(this.toString(), this, value,
    { this == value },
    "$errTag $this == $value")
}

// Capture an exception and produce its name.
// Usage:
//   capture {
//     // Code that fails
//   } eq "FailureException"
fun capture(f: () -> Unit): String =
  try {
    f()
    expectedException
  } catch(e: Throwable) {
    e.javaClass.simpleName
  }

// Capture a stack trace for comparison.
// Usage:
//   stacktrace {
//     // Code that fails
//   } eq """(stack trace)"""
fun stacktrace(f: () -> Unit): String =
  try {
    f()
    expectedException
  } catch(e: Throwable) {
    val trace = StringWriter()
    e.printStackTrace(PrintWriter(trace))
    trace.toString()
  }

// Capture first line of stack trace,
// and extract just the essence:
fun stacktrace1(f: () -> Unit): String =
  try {
    f()
    expectedException
  } catch(e: Throwable) {
    val trace = StringWriter()
    e.printStackTrace(PrintWriter(trace))
    trace.toString().lines().first()
      .replaceBefore(
        ":", e.javaClass.simpleName)
  }

// Add messages via trace(msg). Validate with:
// trace eq "(trace contents)"
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
