// CheckInstructions/LocalFile.kt
package checkinstructions
import java.io.File
import java.nio.file.Path
import java.nio.file.Paths
import atomictest.eq

fun localFile(name: String): File {
  val targetDir: Path = Paths.get(
    "Examples",
    "CheckInstructions")
  require(targetDir.toFile().exists()) {
    "$targetDir does not exist"
  }
  return targetDir.resolve(name).toFile()
}

fun main() {
  localFile("Test.txt") eq
    Paths.get("Examples",
      "CheckInstructions",
      "Test.txt").toString()
}
