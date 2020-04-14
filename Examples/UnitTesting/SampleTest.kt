// UnitTesting/SampleTest.kt
package unittesting
import kotlin.test.*

class SampleTest {
  @Test
  fun testFoo() {
    expect(42, "Wrong answer") { foo() }
  }

  @Test
  fun testAllIsGood() {
    assertTrue(allIsGood(), "Wrong answer")
  }
}
