// WithFunction/UsingWith.kt
package withfunction
import atomictest.eq

fun betterAdjust(window: Window) {
  with(window) {
    x = 10
    y = 10
    width *= 2
    height *= 2
  }
}

fun main(args: Array<String>) {
  val window = Window("my")
  betterAdjust(window)
  window.x eq 10
  window.width eq 400
}
