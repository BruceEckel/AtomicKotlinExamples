// ResourceCleanup/ForEachLine.kt
package resourcecleanup
import checkinstructions.dataFile

fun main() {
  dataFile("Results.txt").forEachLine {
    if (it.startsWith("#"))
      println("'$it'")
  }
}
/* Output:
'# ok'
*/
