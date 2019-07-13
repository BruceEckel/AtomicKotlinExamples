// Logging/UseAtomicLog.kt
import atomiclog.*
import atomictest.eq

fun main() {
  log.report("Hello, Atomic Log!")
  logFile.readText() eq
"""Trace: Hello, Atomic Log!
Debug: Hello, Atomic Log!
Info: Hello, Atomic Log!
Warn: Hello, Atomic Log!
Error: Hello, Atomic Log!
"""
}
