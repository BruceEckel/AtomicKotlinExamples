// ResourceCleanup/Closeable.kt
package resourcecleanup
import atomictest.eq
import checkinstructions.dataFile

fun main() {
  dataFile("Results.txt")
    .bufferedReader()
    .use { it.readLines().first() } eq
    "Results"
}
