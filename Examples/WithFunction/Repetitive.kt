// WithFunction/Repetitive.kt
package withfunction
import atomictest.eq

class Window(
  val id: String,
  var x: Int = 0,
  var y: Int = 0,
  var width: Int = 200,
  var height: Int = 100
)

fun adjustWindow(window: Window) {
  window.x = 10
  window.y = 10
  window.width *= 2
  window.height *= 2
}

fun main() {
  val window = Window("my")
  adjustWindow(window)
  window.x eq 10
  window.width eq 400
}
