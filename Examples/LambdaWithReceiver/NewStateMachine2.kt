// LambdaWithReceiver/NewStateMachine2.kt
package statemachine2
import statemachine.StateMachine

fun newStateMachine1(
  operate: (StateMachine) -> Unit     // [1]
) {
  val stateMachine = StateMachine()
  stateMachine.start() 
  operate(stateMachine)               // [2]
}

fun newStateMachine2(
  operate: StateMachine.() -> Unit    // [3]
) {
  val stateMachine = StateMachine()
  stateMachine.start()
  stateMachine.operate()              // [4]
}

fun main() {
  newStateMachine1 {
    it.finish()
  }
  newStateMachine2 {
    finish()
  }
}
