// ErrorReporting/LocalFile.kt
package errorreporting
import java.io.*
import java.nio.file.Paths

fun localFile(name: String): File =
  Paths.get("Examples",
    "ErrorReporting", name).toFile()
