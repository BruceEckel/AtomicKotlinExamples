// Logging/SimpleLoggingStrategy.kt
package logging
import java.nio.file.Paths

val logFile = Paths.get("Examples",
  "Logging", "simpleLogFile.txt").toFile()

fun debug(msg: String) =
  System.err.println("Debug: " + msg)
// To disable:
// fun debug(msg: String) = Unit

fun trace(msg: String) =
  logFile.appendText("Trace: $msg\n")

fun main(args: Array<String>) {
  debug("Simple Logging Strategy")
  trace("Line 1")
  trace("Line 2")
}
