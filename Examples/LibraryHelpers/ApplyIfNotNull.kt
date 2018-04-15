// LibraryHelpers/ApplyIfNotNull.kt
package libraryhelpers

import atomictest.eq

fun showMainWindow(
  windowById: Map<String, Window>
) {
  val mainWindow =
    windowById["main"]?.apply {
      x = 10
      y = 10
      width *= 2
      height *= 2
    } ?: return
  showWindow(mainWindow)
}

fun showWindow(window: Window) {
  // ...
  println("Showing ${window.id} window...")
}

fun main(args: Array<String>) {
  val mainWindow = Window("main")
  showMainWindow(mapOf("main" to mainWindow))
  mainWindow.x eq 10
}
/* Output:
Showing main window...
10
*/
