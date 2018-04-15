// LibraryHelpers/NullableReceiver.kt
package libraryhelpers

class Window(
  val id: String,
  var x: Int = 0,
  var y: Int = 0,
  var width: Int = 200,
  var height: Int = 100
)

fun adjustWindowIfNotNull(window: Window?) {
  window?.run {
    this.x = 10          // [1]
    y = 10
    width *= 2
    height *= 2
  }
}

fun main(args: Array<String>) {
  val windowOrNull: Window? = null
  // Nothing happens:
  adjustWindowIfNotNull(windowOrNull)
}
