// LambdaWithReceiver/UseNewStateMachine2.kt
package statemachine2
import atomictest.*

fun main() {
  newStateMachine2 {     // [1]
    this.pause()         // [2]
    resume()             // [3]
    finish()
  }
  trace eq """
    Off -> On
    On -> Paused
    Paused -> On
    On -> Off
  """
}
