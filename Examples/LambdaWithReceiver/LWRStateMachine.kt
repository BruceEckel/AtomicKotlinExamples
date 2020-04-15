// LambdaWithReceiver/LWRStateMachine.kt
package statemachine
import statemachine.State.*

enum class State { ON, OFF, PAUSED }

class StateMachine {
  var state: State = OFF
    private set

  private fun updateState(
    current: State?, new: State
  ) {
    if (current == null || state == current) {
      println("$state -> $new")
      state = new
    }
  }

  fun start() = updateState(OFF, ON)

  fun pause() = updateState(ON, PAUSED)

  fun resume() = updateState(PAUSED, ON)

  fun finish() = updateState(null, OFF)
}
