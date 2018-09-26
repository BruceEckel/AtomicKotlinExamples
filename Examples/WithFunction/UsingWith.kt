// WithFunction/UsingWith.kt
package withfunction
import atomictest.eq

fun withAdjust(window: Window) {
  with(window) {
    x = 10
    y = 10
    width *= 2
    height *= 2
  }
}

fun main() {
  val window = Window("my")
  withAdjust(window)
  window.x eq 10
  window.width eq 400
}
