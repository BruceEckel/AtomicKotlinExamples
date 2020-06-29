// Tests/unittesting/StateMachineTest.kt
package unittesting
import kotlin.test.*

class StateMachineTest {
  private lateinit var sm: StateMachine // [1]
  @BeforeTest
  fun initStateMachine() {
    sm = StateMachine()                 // [2]
  }
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
