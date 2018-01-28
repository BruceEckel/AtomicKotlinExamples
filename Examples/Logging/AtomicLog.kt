// Logging/AtomicLog.kt
package atomiclog
import java.nio.file.Paths

val logFile = Paths.get("Examples",
  "Logging", "atomicLog.txt").toFile()

object log {
  init {
    // Reset for each run:
    if (logFile.exists())
      logFile.delete()
  }

  private fun log(type: String, msg: String) =
    logFile.appendText("$type: $msg\n")

  fun trace(msg: String) = log("Trace", msg)
  fun debug(msg: String) = log("Debug", msg)
  fun info(msg: String) = log("Info", msg)
  fun warn(msg: String) = log("Warn", msg)
  fun error(msg: String) = log("Error", msg)
}
