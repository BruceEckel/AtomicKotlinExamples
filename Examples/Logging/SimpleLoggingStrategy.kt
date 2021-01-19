// Logging/SimpleLoggingStrategy.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package logging
import checkinstructions.DataFile

val logFile = // Reset ensures an empty file:
  DataFile("simpleLogFile.txt").reset()

fun debug(msg: String) =
  System.err.println("Debug: $msg")
// To disable:
// fun debug(msg: String) = Unit

fun trace(msg: String) =
  logFile.appendText("Trace: $msg\n")

fun main() {
  debug("Simple Logging Strategy")
  trace("Line 1")
  trace("Line 2")
  println(logFile.readText())
}
/* Sample Output:
Debug: Simple Logging Strategy
Trace: Line 1
Trace: Line 2
*/
