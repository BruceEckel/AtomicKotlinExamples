// Exceptions/StackTrace.kt
import atomictest.ceq
import java.io.*

fun main(args: Array<String>) {
  try {
    throw Exception("StackTrace")
  } catch(e: Exception) {
    val trace = StringWriter()
    e.printStackTrace(PrintWriter(trace))
    trace.toString().trim() ceq
    """java.lang.Exception: StackTrace
        at StackTraceKt.main(StackTrace.kt:7)"""
  }
}
