// UnitTesting/StateMachine.kt
package unittesting
import unittesting.State.*

enum class State { ON, OFF, PAUSED }

class StateMachine {
  var state: State = OFF
    private set
  private fun transition(
    new: State, current: State = ON
  ) {
    if(new == OFF && state != OFF)
      state = OFF
    else if(state == current)
      state = new
  }
  fun start() = transition(ON, OFF)
  fun pause() = transition(PAUSED, ON)
  fun resume() = transition(ON, PAUSED)
  fun finish() = transition(OFF)
}
