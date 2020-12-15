// Tests/unittesting/UnitTestingSoln2.kt
package unitTestingExercise2
import interfaces.Desktop
import interfaces.DeepThought
import interfaces.Quantum
import kotlin.test.*

class DesktopTest {
  val desktop = Desktop()
  @Test
  fun prompt() {
    assertEquals("Hello!", desktop.prompt())
  }
  @Test
  fun calculateAnswer() {
    assertEquals(11, desktop.calculateAnswer())
  }
}

class DeepThoughtTest {
  val deepThought = DeepThought()
  @Test
  fun prompt() {
    assertEquals("Thinking...", deepThought.prompt())
  }
  @Test
  fun calculateAnswer() {
    assertEquals(42, deepThought.calculateAnswer())
  }
}

class QuantumTest {
  val quantum = Quantum()
  @Test
  fun prompt() {
    assertEquals("Probably...", quantum.prompt())
  }
  @Test
  fun calculateAnswer() {
    assertEquals(-1, quantum.calculateAnswer())
  }
}
