// ResourceCleanup/ForEachLine.kt
package resourcecleanup
import checkingrequirements.localFile

fun main() {
  localFile("results.txt").forEachLine {
    if (it.startsWith("#"))
      println("'$it'")
  }
}
/* Output:
'# ok'
*/
