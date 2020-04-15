// CheckInstructions/DataFile.kt
package checkinstructions
import atomictest.eq
import java.io.File
import java.nio.file.Paths

fun dataFile(name: String): File {
  val targetDir = File("DataFiles")
  require(targetDir.exists()) {
    "$targetDir does not exist"
  }
  return targetDir.resolve(name)
}

fun main() {
  dataFile("Test.txt") eq
    Paths.get("DataFiles",
      "Test.txt").toString()
}
