// LambdaWithReceiver/UseNewStateMachine1.kt
package statemachine

fun main() {
  println("first")
  newStateMachine1 { sm ->    // [1]
    sm.finish()               // [2]
  }
  println("second")
  newStateMachine1 {
    it.pause()                // [3]
    it.resume()
    it.finish()
  }
}
/* Output:
first
OFF -> ON
ON -> OFF
second
OFF -> ON
ON -> PAUSED
PAUSED -> ON
ON -> OFF
*/
