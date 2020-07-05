// LambdaWithReceiver/LWRStateMachine.kt
package statemachine
import atomictest.*
import statemachine.State.*

enum class State { On, Off, Paused }

class StateMachine {
  var state: State = Off
    private set
  private fun transition(
    new: State, current: State = On
  ) {
    if(new == Off && state != Off)
      state = Off
    else if(state == current) {
      trace("$state -> $new")
      state = new
    }
  }
  fun start() = transition(On, Off)
  fun pause() = transition(Paused, On)
  fun resume() = transition(On, Paused)
  fun finish() = transition(Off)
}
