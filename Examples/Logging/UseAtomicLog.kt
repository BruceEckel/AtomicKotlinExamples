// Logging/UseAtomicLog.kt
import atomiclog.Logger
import atomictest.eq

private val logger = Logger("AtomicLog.txt")

fun main() {
  logger.report("Hello, Atomic Log!")
  logger.logFile.readText().trim() eq
"""Trace: Hello, Atomic Log!
Debug: Hello, Atomic Log!
Info: Hello, Atomic Log!
Warn: Hello, Atomic Log!
Error: Hello, Atomic Log!"""
}
