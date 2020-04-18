// LambdaWithReceiver/LWRStateMachine.kt
package statemachine
import atomictest.Trace
import statemachine.State.*

val trace = Trace()

enum class State { ON, OFF, PAUSED }

class StateMachine {
  var state: State = OFF
    private set

  private fun updateState(
    current: State?, new: State
  ) {
    if (current == null || state == current) {
      trace("$state -> $new")
      state = new
    }
  }

  fun start() = updateState(OFF, ON)

  fun pause() = updateState(ON, PAUSED)

  fun resume() = updateState(PAUSED, ON)

  fun finish() = updateState(null, OFF)
}
