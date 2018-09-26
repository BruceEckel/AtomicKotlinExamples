// LocalFunctions/HelperFunction.kt
package localfunctions
import atomictest.eq

class Window(
  var height: Int,
  var width: Int,
  var isVisible: Boolean
)

fun minimizeWindow(window: Window) {
  with(window) {
    if (!window.isVisible) return   // [1]
    height = 0
    width = 0
  }
  // ...                            // [2]
}

fun main() {
  Window(100, 100, true)
    .also { minimizeWindow(it) }
    .height eq 0
  Window(100, 100, false)
    .also { minimizeWindow(it) }
    .height eq 100
}
