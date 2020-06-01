// WithFunction/StateMachineSoln1.kt
package statemachinesoln1
import statemachinesoln1.State.*

enum class State { ON, OFF, PAUSED }

class StateMachine {
  var state: State = OFF
    private set
  private fun transition(
    new: State, current: State = ON
  ) {
    if (new == OFF && state != OFF) {
      println("$state -> OFF")
      state = OFF
    } else if (state == current) {
      state = new
      println("$current -> $new")
    }
  }
  fun start() = transition(ON, OFF)
  fun pause() = transition(PAUSED, ON)
  fun resume() = transition(ON, PAUSED)
  fun finish() = transition(OFF)
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
OFF -> ON
ON -> PAUSED
PAUSED -> ON
ON -> OFF
OFF -> ON
ON -> PAUSED
PAUSED -> ON
ON -> OFF
*/
