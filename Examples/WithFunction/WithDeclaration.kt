// WithFunction/WithDeclaration.kt
package simplifieddeclaration
import withfunction.Window

fun <T> with(
  receiver: T,                 // [1]
  block: T.() -> Unit          // [2]
) {
  receiver.block()             // [3]
}

fun betterAdjust(window: Window) {
  with(window) {               // [4]
    this.x = 10                // [5]
    y = 10                     // [6]
    width *= 2
    height *= 2
  }
}
