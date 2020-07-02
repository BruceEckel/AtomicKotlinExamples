// Tests/unittesting/StateMachineTest.kt
package unittesting
import kotlin.test.*

class StateMachineTest {
  val sm = StateMachine()
  @Test
  fun start() {
    sm.start()
    assertEquals(State.On, sm.state)
  }
  @Test
  fun `pause and resume`() {
    sm.start()
    sm.pause()
    assertEquals(State.Paused, sm.state)
    sm.resume()
    assertEquals(State.On, sm.state)
    sm.pause()
    assertEquals(State.Paused, sm.state)
  }
  // ...
}
