// Logging/UseAtomicLog.kt
import atomiclog.*
import atomictest.eq

fun main() {
  val msg = "Hello, Atomic Log!"
  log.trace(msg)
  log.debug(msg)
  log.info(msg)
  log.warn(msg)
  log.error(msg)
  logFile.readText() eq
    """Trace: Hello, Atomic Log!
Debug: Hello, Atomic Log!
Info: Hello, Atomic Log!
Warn: Hello, Atomic Log!
Error: Hello, Atomic Log!
"""
}
