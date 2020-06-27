// ScopeFunctions/CheckArgument.kt
package scopefunctions
import atomictest.trace

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
  // Call let() on an expression:
  windowById["greeting"]?.let {
    showWindow(it)
  }
}

fun main() {
  showGreetingWindow(mapOf(
    "greeting" to Window("greeting")))
  trace("no Window:")
  showGreetingWindow(mapOf())
  trace eq """
  Showing greeting window...
  Window(id=greeting, x=0, y=0, w=200, h=100)
  Showing greeting window...
  Window(id=greeting, x=0, y=0, w=200, h=100)
  Showing greeting window...
  Window(id=greeting, x=0, y=0, w=200, h=100)
  no Window:
  """
}
