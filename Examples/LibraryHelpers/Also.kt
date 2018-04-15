// LibraryHelpers/Also.kt
package libraryhelpers

fun showAdjustedWindow(window: Window) {
  window.apply {
    x = 10
    y = 10
    width *= 2
    height *= 2
  }.also {
    showWindow(it)
  }
}
