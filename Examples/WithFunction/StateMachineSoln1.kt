// WithFunction/StateMachineSoln1.kt
package statemachinesoln1
import statemachinesoln1.State.*

enum class State { On, Off, Paused }

class StateMachine {
  var state: State = Off
    private set
  private fun transition(
    new: State, current: State = On
  ) {
    if (new == Off && state != Off) {
      println("$state -> Off")
      state = Off
    } else if (state == current) {
      state = new
      println("$current -> $new")
    }
  }
  fun start() = transition(On, Off)
  fun pause() = transition(Paused, On)
  fun resume() = transition(On, Paused)
  fun finish() = transition(Off)
}

fun cycle1(sm: StateMachine) {
  sm.start()
  sm.pause()
  sm.resume()
  sm.finish()
}

fun cycle2(sm: StateMachine) {
  with(sm) {
    start()
    pause()
    resume()
    finish()
  }
}

fun main() {
  cycle1(StateMachine())
  cycle2(StateMachine())
}
/* Example Output:
Off -> On
On -> Paused
Paused -> On
On -> Off
Off -> On
On -> Paused
Paused -> On
On -> Off
*/
