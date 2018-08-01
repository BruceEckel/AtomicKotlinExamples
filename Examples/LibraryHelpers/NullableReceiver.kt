// LibraryHelpers/NullableReceiver.kt
package libraryhelpers

data class Window(  // Makes it displayable
  val id: String = "none",
  var x: Int = 0,   // Horizontal location
  var y: Int = 0,   // Vertical Location
  var w: Int = 200, // Width
  var h: Int = 100  // Height
)

fun adjustWindowIfNotNull(window: Window?) {
  window?.run {          // [1]
    this.x = 10          // [2]
    y = 10
    w *= 2
    h *= 2
    println(this)
  }
}

fun main(args: Array<String>) {
  val windowOrNull: Window? = null
  // Nothing happens:
  adjustWindowIfNotNull(windowOrNull)
}
