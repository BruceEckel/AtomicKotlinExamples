// ExtensionLambdas/SMExtensions.kt
package statemachine

fun StateMachine.pauseAndResume() {
  this.pause()   // Explicit
  resume()       // Implicit
}
