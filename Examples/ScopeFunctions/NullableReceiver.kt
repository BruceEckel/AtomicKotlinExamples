// ScopeFunctions/NullableReceiver.kt
package scopefunctions

data class Window(       // [1]
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

fun main() {
  val windowOrNull: Window? = null
  adjustWindowIfNotNull(windowOrNull)
  println("Nothing happens")
}
/* Output:
Nothing happens
*/
