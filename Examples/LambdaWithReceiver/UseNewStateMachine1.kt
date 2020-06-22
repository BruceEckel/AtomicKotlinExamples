// LambdaWithReceiver/UseNewStateMachine1.kt
package statemachine
import atomictest.*

fun main() {
  trace("first")
  newStateMachine1 { sm ->    // [1]
    sm.finish()               // [2]
  }
  trace("second")
  newStateMachine1 {
    it.pause()                // [3]
    it.resume()
    it.finish()
  }
  trace eq """
  first
  OFF -> ON
  ON -> OFF
  second
  OFF -> ON
  ON -> PAUSED
  PAUSED -> ON
  ON -> OFF
  """
}
