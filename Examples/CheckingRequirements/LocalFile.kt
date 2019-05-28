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
    throw Exception("No 'Examples' directory")
