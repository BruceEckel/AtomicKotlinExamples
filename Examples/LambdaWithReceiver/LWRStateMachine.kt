// LambdaWithReceiver/LWRStateMachine.kt
package statemachine
import atomictest.*
import statemachine.State.*

enum class State { On, Off, Paused }

class StateMachine {
  var state: State = Off
    private set

  private fun updateState(
    current: State?, new: State
  ) {
    if (current == null || state == current) {
      trace("$state -> $new")
      state = new
    }
  }

  fun start() = updateState(Off, On)

  fun pause() = updateState(On, Paused)

  fun resume() = updateState(Paused, On)

  fun finish() = updateState(null, Off)
}
