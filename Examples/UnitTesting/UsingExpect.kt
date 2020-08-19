// UnitTesting/UsingExpect.kt
// ©2020 Mindview LLC. See Copyright.txt for permissions.
package unittesting
import atomictest.*
import kotlin.test.*

fun testFortyTwo2(n: Int = 42) {
  expect(n, "Incorrect,") { fortyTwo() }
}

fun main() {
  testFortyTwo2()
  capture {
    testFortyTwo2(43)
  } eq "AssertionError: " +
    "Incorrect, expected:<43> but was:<42>"
  assertFails { testFortyTwo2(43) }
  capture {
    assertFails { testFortyTwo2() }
  } eq "AssertionError: Expected an " +
    "exception to be thrown, but was " +
    "completed successfully."
  assertFailsWith<AssertionError> {
    testFortyTwo2(43)
  }
  capture {
    assertFailsWith<AssertionError> {
      testFortyTwo2()
    }
  } eq "AssertionError: Expected an " +
    "exception of class " +
    "java.lang.AssertionError to be " +
    "thrown, but was completed successfully."
}
