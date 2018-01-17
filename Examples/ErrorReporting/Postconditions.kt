// ErrorReporting/Postconditions.kt
import errorreporting.*
import atomictest.*

val resultFile = localFile("results.txt")

fun createResultFile(create: Boolean) {
  if(create)
    resultFile.writeText("Results")
  // ... other execution paths
  check(resultFile.exists(),
  {"${resultFile.getName()} doesn't exist!"})
}

fun main(args: Array<String>) {
  if(resultFile.exists())
    resultFile.delete()
  capture {
    createResultFile(false)
  } eq """IllegalStateException:
  results.txt doesn't exist!"""
  createResultFile(true)
}
