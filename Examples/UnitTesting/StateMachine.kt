// UnitTesting/StateMachine.kt
package unittesting
import unittesting.State.*

enum class State { ON, OFF, PAUSED }

class StateMachine {
  var state: State = OFF
    private set
  private fun updateState(
    current: State, new: State
  ) {
    if (state == current) {
      state = new
    }
  }
  fun start() = updateState(OFF, ON)
  fun pause() = updateState(ON, PAUSED)
  fun resume() = updateState(PAUSED, ON)
  fun finish() {
    state = OFF
  }
}
