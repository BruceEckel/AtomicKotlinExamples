// Logging/LoggingSoln3.kt
package loggingsoln3
import atomictest.eq
import checkinstructions.DataFile
import loggingsoln3.Level.*

enum class Level {
  Trace, Debug, Info, Warn, Error
}

var debugLevel = Error

class Logger(fileName: String) {
  val logFile = DataFile(fileName).reset()
  private fun log(type: String, msg: String) =
    logFile.appendText("$type: $msg\n")
  fun trace(msg: String) {
    if(Trace.ordinal >= debugLevel.ordinal)
      log("Trace", msg)
  }
  fun debug(msg: String) {
    if(Debug.ordinal >= debugLevel.ordinal)
      log("Debug", msg)
  }
  fun info(msg: String) {
    if(Info.ordinal >= debugLevel.ordinal)
      log("Info", msg)
  }
  fun warn(msg: String) {
    if(Warn.ordinal >= debugLevel.ordinal)
      log("Warn", msg)
  }
  fun error(msg: String) {
    if(Error.ordinal >= debugLevel.ordinal)
      log("Error", msg)
  }
  fun report(msg: String) {
    trace(msg)
    debug(msg)
    info(msg)
    warn(msg)
    error(msg)
  }
}

private val log = Logger("LoggingSoln2.txt")

fun main() {
  Level.values().toList().forEach {
    debugLevel = it
    log.report("debugLevel($debugLevel)")
  }
  log.logFile.readText() eq
"""Trace: debugLevel(Trace)
Debug: debugLevel(Trace)
Info: debugLevel(Trace)
Warn: debugLevel(Trace)
Error: debugLevel(Trace)
Debug: debugLevel(Debug)
Info: debugLevel(Debug)
Warn: debugLevel(Debug)
Error: debugLevel(Debug)
Info: debugLevel(Info)
Warn: debugLevel(Info)
Error: debugLevel(Info)
Warn: debugLevel(Warn)
Error: debugLevel(Warn)
Error: debugLevel(Error)
"""
}
