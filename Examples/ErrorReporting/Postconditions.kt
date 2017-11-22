// ErrorReporting/Postconditions.kt
import errorreporting.*
import atomictest.*

val resultFile = localFile("results.txt")

fun createResultFile(create: Boolean) {
  if(create)
    resultFile.writeText("Results")
  // ... other execution paths
  check(resultFile.exists(),
    { "$resultFile doesn't exist!" })
}

fun main(args: Array<String>) {
  if(resultFile.exists())
    resultFile.delete()
  capture {
    createResultFile(false)
  } eq "IllegalStateException"
  createResultFile(true)
}
