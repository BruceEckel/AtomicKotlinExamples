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
    Off -> On
    On -> Off
    second
    Off -> On
    On -> Paused
    Paused -> On
    On -> Off
  """
}
