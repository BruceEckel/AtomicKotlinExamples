// ResourceCleanup/AutoCloseable.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package resourcecleanup
import atomictest.eq
import checkinstructions.DataFile

fun main() {
  DataFile("Results.txt")
    .bufferedReader()
    .use { it.readLines().first() } eq
    "Results"
}
