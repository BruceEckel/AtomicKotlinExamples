// UnitTesting/StateMachine.kt
package unittesting
import unittesting.State.*

enum class State { ON, OFF, PAUSED }

class StateMachine {
  var state: State = OFF
    private set
  private fun transition(
    current: State, new: State
  ) {
    if (state == current)
      state = new
  }
  fun start() = transition(OFF, ON)
  fun pause() = transition(ON, PAUSED)
  fun resume() = transition(PAUSED, ON)
  fun finish() { state = OFF }
}
