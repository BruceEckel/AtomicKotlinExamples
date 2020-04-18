// ScopeFunctions/Let.kt
package scopefunctions

fun showGreetingWindow2(
  windowById: Map<String, Window>
) {
  windowById["greeting"]?.let {
    showWindow(it)
  }
}

fun main() {
  trace.clear()
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
