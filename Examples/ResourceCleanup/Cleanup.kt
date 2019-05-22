// ResourceCleanup/Cleanup.kt
package resourcecleanup
import atomictest.eq
import checkingrequirements.localFile

fun main() {
  localFile("Results.txt")
    .bufferedReader()
    .use { it.readLines().first() } eq
      "Results"
}
