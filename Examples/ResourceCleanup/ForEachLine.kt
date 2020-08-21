// ResourceCleanup/ForEachLine.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package resourcecleanup
import checkinstructions.DataFile
import atomictest.*

fun main() {
  DataFile("Results.txt").forEachLine {
    if (it.startsWith("#"))
      trace("$it")
  }
  trace eq "# ok"
}
