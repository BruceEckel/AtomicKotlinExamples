// CheckInstructions/GetTrace.kt
package checkinstructions
import atomictest.capture
import atomictest.eq

fun getTrace(fileName: String): List<String> {
  require(fileName.startsWith("trace_")) {
    "$fileName must start with 'trace_'"
  }
  val trace = localFile(fileName)
  require(trace.exists()) {
    "$fileName doesn't exist"
  }
  val lines = trace.readLines()
  require(lines.isNotEmpty()) {
    "$fileName is empty"
  }
  return lines
}

fun main() {
  localFile("trace_empty.txt").writeText("")
  localFile("trace_real.txt").writeText(
    "wubba lubba dub dub")
  capture {
    getTrace("wrong_name.txt")
  } eq "IllegalArgumentException: " +
    "wrong_name.txt must start with 'trace_'"
  capture {
    getTrace("trace_nonexistent.txt")
  } eq "IllegalArgumentException: " +
    "trace_nonexistent.txt doesn't exist"
  capture {
    getTrace("trace_empty.txt")
  } eq "IllegalArgumentException: " +
    "trace_empty.txt is empty"
  getTrace("trace_real.txt") eq
    "[wubba lubba dub dub]"
}
