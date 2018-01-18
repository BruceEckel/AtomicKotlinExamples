// ErrorReporting/ReadTraceFile.kt
import errorreporting.*
import atomictest.*

fun readTrace(fileName: String) {
  require(fileName.startsWith("trace_"),
    { "$fileName must start with 'trace_'" })
  val trace = localFile(fileName)
  require(trace.exists(),
    { "$fileName doesn't exist" })
  val lines = trace.readLines()
  require(lines.size > 0,
    { "$fileName is empty" })
}

fun main(args: Array<String>) {
  // Create dummy trace files:
  localFile("trace_empty.txt").writeText("")
  localFile("trace_real.txt").writeText("\n")
  capture {
    readTrace("foo.txt")
  } eq "IllegalArgumentException: " +
      "foo.txt must start with 'trace_'"
  capture {
    readTrace("trace_foo.txt")
  } eq "IllegalArgumentException: " +
      "trace_foo.txt doesn't exist"
  capture {
    readTrace("trace_empty.txt")
  } eq "IllegalArgumentException: " +
      "trace_empty.txt is empty"
  readTrace("trace_real.txt")
}
