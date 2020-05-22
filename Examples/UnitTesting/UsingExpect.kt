// UnitTesting/UsingExpect.kt
package unittesting
import kotlin.test.*

fun testFortyTwo2() =
  expect(42, "Wrong answer") { fortyTwo() }

fun main() {
  testFortyTwo2()
}
