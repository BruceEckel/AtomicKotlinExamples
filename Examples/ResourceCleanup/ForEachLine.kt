// ResourceCleanup/ForEachLine.kt
package resourcecleanup
import checkinstructions.dataFile

fun main() {
  dataFile("results.txt").forEachLine {
    if (it.startsWith("#"))
      println("'$it'")
  }
}
/* Output:
'# ok'
*/
