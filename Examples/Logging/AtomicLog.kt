// Logging/AtomicLog.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package atomiclog
import checkinstructions.DataFile

class Logger(fileName: String) {
  val logFile = DataFile(fileName).reset()
  private fun log(type: String, msg: String) =
    logFile.appendText("$type: $msg\n")
  fun trace(msg: String) = log("Trace", msg)
  fun debug(msg: String) = log("Debug", msg)
  fun info(msg: String) = log("Info", msg)
  fun warn(msg: String) = log("Warn", msg)
  fun error(msg: String) = log("Error", msg)
  // For basic testing:
  fun report(msg: String) {
    trace(msg)
    debug(msg)
    info(msg)
    warn(msg)
    error(msg)
  }
}
