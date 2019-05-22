// ResourceCleanup/Cleanup2.kt
package resourcecleanup
import atomictest.eq
import checkingrequirements.localFile

fun main() {
  localFile("Results.txt").useLines {
    it.filter { "#" in it }.first()    // [1]
  } eq "# ok"

  localFile("Results.txt").useLines {
    lines -> lines.filter {            // [2]
      line -> "#" in line
    }.first()
  } eq "# ok"
}
