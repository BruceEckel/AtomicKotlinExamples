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
      w *= 2
      h *= 2
    } ?: return                 // [1]
  showWindow(mainWindow)
}

fun showWindow(window: Window) {
  // ...
  println("Showing ${window.id} window...")
  println(window)
}

fun main(args: Array<String>) {
  val mainWindow = Window("main")
  showMainWindow(mapOf("main" to mainWindow))
  mainWindow.x eq 10
  val noneWindow = Window()
  showMainWindow(mapOf("none" to noneWindow))
  noneWindow.x eq 0
}
/* Output:
Showing main window...
Window(id=main, x=10, y=10, w=400, h=200)
10
0
*/
