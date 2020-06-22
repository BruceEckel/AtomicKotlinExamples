// ScopeFunctions/Also.kt
package scopefunctions
import atomictest.*

fun showAdjustedWindow(window: Window) {
  window.apply {
    x = 7
    y = 9
    w *= 3
    h *= 4
  }.also {                   // [1]
    showWindow(it)
  }
}

fun main() {
  val w = Window()
  trace(w)
  showAdjustedWindow(w)
  trace eq """
  Window(id=none, x=0, y=0, w=200, h=100)
  Showing none window...
  Window(id=none, x=7, y=9, w=600, h=400)
  """
}
