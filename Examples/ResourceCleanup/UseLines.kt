// ResourceCleanup/UseLines.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package resourcecleanup
import atomictest.eq
import checkinstructions.DataFile

fun main() {
  DataFile("Results.txt").useLines {
    it.filter { "#" in it }.first()  // [1]
  } eq "# ok"
  DataFile("Results.txt").useLines { lines ->
    lines.filter { line ->           // [2]
      "#" in line
    }.first()
  } eq "# ok"
}
