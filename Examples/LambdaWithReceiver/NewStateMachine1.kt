// LambdaWithReceiver/NewStateMachine1.kt
package statemachine

fun newStateMachine1(
  operate: (StateMachine) -> Unit
) {
  val stateMachine = StateMachine()
  stateMachine.start() 
  operate(stateMachine)
}
