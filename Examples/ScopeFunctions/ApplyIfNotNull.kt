// ScopeFunctions/ApplyIfNotNull.kt
package scopefunctions
import atomictest.*

fun showMainWindow(
  windowById: Map<String, Window>
) {
  val mainWindow =
    windowById["main"]?.apply {
      x = 10
      y = 10
      w *= 2
      h *= 2
    } ?: return                 // [1]
  showWindow(mainWindow)
}

fun showWindow(window: Window) {
  // ...
  trace("Showing ${window.id} window...")
  trace(window)
}

fun main() {
  val mainWindow = Window("main")
  showMainWindow(mapOf("main" to mainWindow))
  mainWindow.x eq 10
  val noneWindow = Window()
  showMainWindow(mapOf("none" to noneWindow))
  noneWindow.x eq 0
  trace eq """
    Showing main window...
    Window(id=main, x=10, y=10, w=400, h=200)
  """
}
