// WithFunction/DefiningWith.kt
package simplifiedwith
import withfunction.Window

fun <T> with(
  receiver: T,                 // [1]
  operations: T.() -> Unit     // [2]
) = receiver.operations()      // [3]

fun withAdjust(window: Window) {
  with(window) {               // [4]
    this.x = 10                // [5]
    y = 10                     // [6]
    width *= 2
    height *= 2
  }
}
