// UnitTesting/SampleTest.kt
package unittesting
import kotlin.test.*

class SampleTest {
  @Test
  fun testAssertEquals() {
    expect(42, "Wrong answer") { fortyTwo() }
  }
  @Test
  fun testAllGood() {
    assertTrue(allGood(true), "Wrong answer")
  }
}
