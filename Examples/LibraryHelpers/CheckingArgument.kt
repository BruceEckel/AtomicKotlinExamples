// LibraryHelpers/CheckingArgument.kt
package libraryhelpers

fun showGreetingWindow(
  windowById: Map<String, Window>
) {
  val greetingWindow = windowById["greeting"]
  // Check for null using if:
  if (greetingWindow != null) {
    showWindow(greetingWindow)
  }
  // Check for null using let():
  greetingWindow?.let {
    showWindow(it)
  }
  // Explicit lambda argument:
  greetingWindow?.let { win ->
    showWindow(win)
  }
}

fun main(args: Array<String>) {
  showGreetingWindow(mapOf(
    "greeting" to Window("greeting")))
  println("no Window:")
  showGreetingWindow(mapOf())
}
/* Output:
Showing greeting window...
Window(id=greeting, x=0, y=0, w=200, h=100)
Showing greeting window...
Window(id=greeting, x=0, y=0, w=200, h=100)
Showing greeting window...
Window(id=greeting, x=0, y=0, w=200, h=100)
no Window:
*/
