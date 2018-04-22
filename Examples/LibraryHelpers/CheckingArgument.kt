// LibraryHelpers/CheckingArgument.kt
package libraryhelpers

fun showGreetingWindow(
  windowById: Map<String, Window>
) {
  val greetingWindow = windowById["greeting"]
  // Not-null check using if:
  if (greetingWindow != null) {
    showWindow(greetingWindow)
  }
  // The similar check with let():
  greetingWindow?.let {
    showWindow(it)
  }
}
