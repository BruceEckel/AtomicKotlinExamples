// LibraryHelpers/Let.kt
package libraryhelpers

fun showGreetingWindow2(
  windowById: Map<String, Window>
) {
  windowById["greeting"]?.let {
    showWindow(it)
  }
}

fun main(args: Array<String>) {
  showGreetingWindow2(mapOf(
    "greeting" to Window("greeting")))
  // Nothing is printed:
  showGreetingWindow2(mapOf())
}
/* Output:
Showing greeting window...
*/
