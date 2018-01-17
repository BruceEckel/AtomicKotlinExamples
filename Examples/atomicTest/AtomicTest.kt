// AtomicTest/AtomicTest.kt
/*
A minimal test framework for the book, to
display results and introduce & promote unit
testing early in the learning curve.
*/
package atomictest
import kotlin.math.abs

private val errorTag = "[Error]:"
private val expectedExceptionMessage =
  "$errorTag Expected an exception"

private fun <L, R> runTest(
  actual: L,
  expected: R,
  checkEquals: Boolean = true,
  test: () -> Boolean
) {
  println(actual)
  if (!test()) {
    print(errorTag)
    val message: String =
      if (checkEquals)
        "$actual != $expected"
      else
        "$actual == $expected"
    println(message)
  }
}

/**
 * Compares string representation
 * of the object with the string `value`.
 * Removes all whitespace to allow embedded
 * linefeeds & indentation.
 */
infix fun <T : Any> T.eq(value: String) {
  val ws = "\\s".toRegex()
  fun String.rmws() = this.replace(ws, "")
  runTest(this, value) {
    this.toString().rmws() == value.rmws()
  }
}

/**
 * Checks that object is equal to `value`.
 */
infix fun <T> T.eq(value: T) {
  runTest(this, value) {
    this == value
  }
}

/**
 * Checks that `Double` number is equal
 * to `value` within a positive delta.
 */
infix fun Double.eq(value: Double) {
  runTest(this, value) {
    abs(this - value) < 0.0000001
  }
}

/**
 * Checks that object isn't equal to `value`.
 */
infix fun <T> T.neq(value: T) {
  runTest(this, value, checkEquals = false) {
    this != value
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
    expectedExceptionMessage
  } catch (e: Throwable) {
    e.javaClass.simpleName +
      (e.message?.let { ": $it" } ?: "")
  }

// Add messages via trace(msg). Validate with:
// trace eq "(trace contents)"
object trace {
  private var result = ""
  operator fun invoke(message: Any) {
    result += message.toString() + "\n"
  }
  fun reset() {
    result = ""
  }
  infix fun eq(value: String) =
    result eq value
}
