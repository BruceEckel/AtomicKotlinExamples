// ResourceCleanup/Closeable.kt
package resourcecleanup
import atomictest.eq
import checkinstructions.localFile

fun main() {
  localFile("Results.txt")
    .bufferedReader()
    .use { it.readLines().first() } eq
    "Results"
}
