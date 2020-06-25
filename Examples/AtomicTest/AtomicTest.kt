// AtomicTest/AtomicTest.kt
package atomictest
import kotlin.math.abs

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
      (if(checkEquals) "!=" else "==") +
      " $expected")
  }
}

/**
 * Compares the string representation
 * of the object with the string `value`.
 */
infix fun <T: Any> T.eq(value: String) {
  runTest(this, value) {
    this.toString() == value
  }
}

/**
 * Verifies that this object is
 * equal to `value`.
 */
infix fun <T> T.eq(value: T) {
  runTest(this, value) {
    this == value
  }
}

/**
 * Verifies that this object is not
 * equal to `value`.
 */
infix fun <T> T.neq(value: T) {
  runTest(this, value, checkEquals = false) {
    this != value
  }
}

/**
 * Verifies that a `Double` number is equal
 * to `value` within a positive delta.
 */
infix fun Double.eq(value: Double) {
  runTest(this, value) {
    abs(this - value) < 0.0000001
  }
}

/**
 * Captures an exception and produces its name.
 * Usage:
 *   ```
 *   capture {
 *     // Code that fails
 *   } eq "FailureException"
 *   ```
 */
fun capture(f: () -> Unit): String =
  try {
    f()
    "$ERROR_TAG Expected an exception"
  } catch (e: Throwable) {
    e::class.simpleName +
      (e.message?.let { ": $it" } ?: "")
  }

object trace {
  private val trc = mutableListOf<String>()
  operator fun invoke(obj: Any?) {
    trc += obj.toString()
  }
  /**
   * Compares Trace contents to a multiline
   * String by ignoring line separators.
   */
  infix fun eq(multiline: String) {
    val trace = trc.joinToString("\n")
    val expected = multiline.trimIndent()
      .trim().replace("\n", " ")
    runTest(trace, multiline) {
      trace.replace("\n", " ") == expected
    }
    trc.clear()
  }
}
