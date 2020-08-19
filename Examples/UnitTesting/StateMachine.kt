// UnitTesting/StateMachine.kt
// ©2020 Mindview LLC. See Copyright.txt for permissions.
package unittesting
import unittesting.State.*

enum class State { On, Off, Paused }

class StateMachine {
  var state: State = Off
    private set
  private fun transition(
    new: State, current: State = On
  ) {
    if(new == Off && state != Off)
      state = Off
    else if(state == current)
      state = new
  }
  fun start() = transition(On, Off)
  fun pause() = transition(Paused, On)
  fun resume() = transition(On, Paused)
  fun finish() = transition(Off)
}
