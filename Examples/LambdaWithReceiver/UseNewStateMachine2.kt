// LambdaWithReceiver/UseNewStateMachine2.kt
package statemachine2
import statemachine.trace

fun main() {
  trace.clear()
  newStateMachine2 {     // [1]
    this.pause()         // [2]
    resume()             // [3]
    finish()
  }
  trace eq """
  OFF -> ON
  ON -> PAUSED
  PAUSED -> ON
  ON -> OFF
  """
}
