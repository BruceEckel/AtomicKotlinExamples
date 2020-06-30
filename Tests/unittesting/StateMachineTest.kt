// Tests/unittesting/StateMachineTest.kt
package unittesting
import kotlin.test.*

class StateMachineTest {
  val sm = StateMachine()
  @Test
  fun start() {
    sm.start()
    assertEquals(State.ON, sm.state)
  }
  @Test
  fun `pause and resume`() {
    sm.start()
    sm.pause()
    assertEquals(State.PAUSED, sm.state)
    sm.resume()
    assertEquals(State.ON, sm.state)
    sm.pause()
    assertEquals(State.PAUSED, sm.state)
  }
  // ...
}
