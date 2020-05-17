// CheckInstructions/Postconditions.kt
package checkinstructions
import atomictest.*

val resultFile = DataFile("Results.txt")

fun createResultFile(create: Boolean) {
  if (create)
    resultFile.writeText("Results\n# ok")
  // ... other execution paths
  check(resultFile.exists()) {
    "${resultFile.name} doesn't exist!"
  }
}

fun main() {
  resultFile.erase()
  capture {
    createResultFile(false)
  } eq "IllegalStateException: " +
    "Results.txt doesn't exist!"
  createResultFile(true)
}
