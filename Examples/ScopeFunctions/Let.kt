// ScopeFunctions/Let.kt
package scopefunctions
import atomictest.*

fun showGreetingWindow2(
  windowById: Map<String, Window>
) {
  windowById["greeting"]?.let {
    showWindow(it)
  }
}

fun main() {
  showGreetingWindow2(mapOf(
    "greeting" to Window("greeting")))
  trace("no Window:")
  showGreetingWindow2(mapOf())
  trace eq """
  Showing greeting window...
  Window(id=greeting, x=0, y=0, w=200, h=100)
  no Window:
  """.trimIndent()
}
