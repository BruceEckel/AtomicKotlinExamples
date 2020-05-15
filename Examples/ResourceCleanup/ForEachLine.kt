// ResourceCleanup/ForEachLine.kt
package resourcecleanup
import checkinstructions.dataFile
import atomictest.*

private val trace = Trace()

fun main() {
  dataFile("Results.txt").forEachLine {
    if (it.startsWith("#"))
      trace("$it")
  }
  trace eq "# ok"
}
