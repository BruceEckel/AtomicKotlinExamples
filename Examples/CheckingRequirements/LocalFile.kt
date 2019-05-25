// CheckingRequirements/LocalFile.kt
package checkingrequirements
import java.io.File
import java.nio.file.Paths
import atomictest.eq

fun localFile(name: String): File =
  if (File("Examples").exists())
    Paths.get("Examples",
      "CheckingRequirements", name).toFile()
  else
    Paths.get("Power Tools",
      "CheckingRequirements", "Examples",
      "src", name).toFile()

fun main() {  // Test it
  val lf = localFile("test_localFile.txt")
  lf.writeText("test localFile()")
  lf.readText() eq "test localFile()"
}
