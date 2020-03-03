// ObjectOrientedDesign/View.kt
package robotexplorer

interface Adapter {
  fun height(): Int
  fun textView(): String
}

class View(val adapter: Adapter) {
  // Start an ANSI terminal control string:
  private val ansiTerm = "\u001B["
  fun clear() =
    print("${ansiTerm}${adapter.height()}T")
  fun show() {
    print("${ansiTerm}0;0H") // Cursor home
    println(adapter.textView())
    Thread.sleep(300L) // Pause
  }
}
