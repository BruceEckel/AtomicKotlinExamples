// ResourceCleanup/ForEachLine.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
import checkinstructions.DataFile
import atomictest.*

fun main() {
  DataFile("Results.txt").forEachLine {
    if (it.startsWith("#"))
      trace("$it")
  }
  trace eq "# ok"
}
