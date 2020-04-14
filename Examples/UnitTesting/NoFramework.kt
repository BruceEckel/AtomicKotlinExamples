// UnitTesting/NoFramework.kt
package unittesting
import kotlin.test.assertEquals
import kotlin.test.assertTrue

fun foo() = 42

fun allIsGood() = true

fun testFoo() {
  assertEquals(
    expected = 42,
    actual = foo(),
    message = "Wrong answer")
}

fun testAllIsGood() {
  assertTrue(allIsGood(), "Wrong answer")
}

fun main() {
  testFoo()
  testAllIsGood()
}
