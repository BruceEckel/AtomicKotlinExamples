// Logging/SimpleLoggingStrategy.kt
package logging
import checkinstructions.dataFile

val logFile = dataFile("simpleLogFile.txt")

fun debug(msg: String) =
  System.err.println("Debug: $msg")
// To disable:
// fun debug(msg: String) { /* do nothing */ }

fun trace(msg: String) =
  logFile.appendText("Trace: $msg\n")

fun main() {
  debug("Simple Logging Strategy")
  trace("Line 1")
  trace("Line 2")
}
/* Sample output:
Debug: Simple Logging Strategy
*/
