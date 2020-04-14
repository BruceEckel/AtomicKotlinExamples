// CheckInstructions/Postconditions.kt
package checkinstructions
import atomictest.*

val resultFile = dataFile("results.txt")

fun createResultFile(create: Boolean) {
  if (create)
    resultFile.writeText("Results\n# ok")
  // ... other execution paths
  check(resultFile.exists()) {
    "${resultFile.name} doesn't exist!"
  }
}

fun main() {
  if (resultFile.exists())
    resultFile.delete()
  capture {
    createResultFile(false)
  } eq "IllegalStateException: " +
    "results.txt doesn't exist!"
  createResultFile(true)
}
