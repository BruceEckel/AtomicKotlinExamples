// CheckingRequirements/LocalFile.kt
package checkingrequirements
import java.io.File
import java.nio.file.Paths

fun localFile(name: String): File =
  if (File("Examples").exists())
    Paths.get("Examples",
      "ErrorReporting", name).toFile()
  else
    Paths.get("Power Tools",
      "Error Reporting", "Examples", "src",
      name).toFile()
