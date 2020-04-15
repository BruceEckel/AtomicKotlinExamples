// LambdaWithReceiver/UseNewStateMachine2.kt
package statemachine2

fun main() {
  newStateMachine2 {     // [1]
    this.pause()         // [2]
    resume()             // [3]
    finish()
  }
}
/* Output:
OFF -> ON
ON -> PAUSED
PAUSED -> ON
ON -> OFF
*/
