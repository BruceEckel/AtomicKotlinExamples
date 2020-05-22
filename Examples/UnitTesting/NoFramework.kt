// UnitTesting/NoFramework.kt
package unittesting
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import atomictest.*

fun fortyTwo() = 42

fun testAssertEquals(n: Int = 42) {
  assertEquals(
    expected = n,
    actual = fortyTwo(),
    message = "Incorrect,")
}

fun allGood(b: Boolean) = b

fun testAllGood(b: Boolean = true) {
  assertTrue(allGood(b), "Not good")
}

fun main() {
  testAssertEquals()
  testAllGood()
  capture {
    testAssertEquals(43)
  } eq "AssertionError: " +
    "Incorrect, expected:<43> but was:<42>"
  capture {
    testAllGood(false)
  } eq "AssertionError: Not good"
}
