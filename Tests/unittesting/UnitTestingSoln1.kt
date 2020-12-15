// Tests/unittesting/UnitTestingSoln1.kt
package unitTestingExercise1
import sealedclasses.Bus
import sealedclasses.Train
import sealedclasses.travel
import kotlin.test.*

class SealedClassesTest {
  @Test
  fun `train travel`() {
    assertEquals("Train S1", travel(Train("S1")))
  }
  @Test
  fun `bus travel`() {
    assertEquals("Bus 11: size 90", travel(Bus("11", 90)))
  }
}
