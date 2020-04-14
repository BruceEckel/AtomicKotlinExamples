// ResourceCleanup/UseLines.kt
package resourcecleanup
import atomictest.eq
import checkinstructions.dataFile

fun main() {
  dataFile("Results.txt").useLines {
    it.filter { "#" in it }.first()  // [1]
  } eq "# ok"
  dataFile("Results.txt").useLines { lines ->
    lines.filter { line ->           // [2]
      "#" in line
    }.first()
  } eq "# ok"
}
