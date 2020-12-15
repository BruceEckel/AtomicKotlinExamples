// AtomicTest/AtomicTest.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package atomictest
import kotlin.math.abs
import kotlin.reflect.KClass

const val ERROR_TAG = "[Error]: "

private fun <L, R> runTest(
  actual: L,
  expected: R,
  checkEquals: Boolean = true,
  test: () -> Boolean
) {
  println(actual)
  if (!test()) {
    print(ERROR_TAG)
    println("$actual " +
      (if (checkEquals) "!=" else "==") +
      " $expected")
  }
}

/**
 * Compares the string representation
 * of this object with the string `rval`.
 */
infix fun <T : Any> T.eq(rval: String) {
  runTest(this, rval) {
    this.toString().trim() == rval.trimIndent()
  }
}

/**
 * Verifies this object is equal to `rval`.
 */
infix fun <T> T.eq(rval: T) {
  runTest(this, rval) {
    this == rval
  }
}

/**
 * Verifies this object is != `rval`.
 */
infix fun <T> T.neq(rval: T) {
  runTest(this, rval, checkEquals = false) {
    this != rval
  }
}

/**
 * Verifies that a `Double` number is equal
 * to `rval` within a positive delta.
 */
infix fun Double.eq(rval: Double) {
  runTest(this, rval) {
    abs(this - rval) < 0.0000001
  }
}

/**
 * Holds captured exception information:
 */
class CapturedException(
  private val exceptionClass: KClass<*>?,
  private val actualMessage: String
) {
  private val fullMessage: String
    get() {
      val className =
        exceptionClass?.simpleName ?: ""
      return className + actualMessage
    }
  infix fun eq(message: String) {
    fullMessage eq message
  }
  infix fun contains(parts: List<String>) {
    if (parts.any { it !in fullMessage }) {
      print(ERROR_TAG)
      println("Actual message: $fullMessage")
      println("Expected parts: $parts")
    }
  }
  override fun toString() = fullMessage
}

/**
 * Captures an exception and produces
 * information about it. Usage:
 *    capture {
 *      // Code that fails
 *    } eq "FailureException: message"
 */
fun capture(f:() -> Unit): CapturedException =
  try {
    f()
    CapturedException(null,
      "$ERROR_TAG Expected an exception")
  } catch (e: Throwable) {
    CapturedException(e::class,
      (e.message?.let { ": $it" } ?: ""))
  }

/**
 * Accumulates output when called as in:
 *   trace("info")
 *   trace(object)
 * Later compares accumulated to expected:
 *   trace eq "expected output"
 */
object trace {
  private val trc = mutableListOf<String>()
  operator fun invoke(obj: Any?) {
    trc += obj.toString()
  }
  /**
   * Compares trc contents to a multiline
   * `String` by ignoring white space.
   */
  infix fun eq(multiline: String) {
    val trace = trc.joinToString("\n")
    val expected = multiline.trimIndent()
      .replace("\n", " ")
    runTest(trace, multiline) {
      trace.replace("\n", " ") == expected
    }
    trc.clear()
  }
}
