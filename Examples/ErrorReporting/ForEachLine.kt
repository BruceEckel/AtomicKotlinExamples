// ErrorReporting/ForEachLine.kt
import errorreporting.localFile

fun main() {
  localFile("ForEachLine.kt").forEachLine {
    if (it.startsWith("//"))
      println("'$it'")
  }
}
/* Output:
'// ErrorReporting/ForEachLine.kt'
*/
