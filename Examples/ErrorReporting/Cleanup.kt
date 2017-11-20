// ErrorReporting/Cleanup.kt
import java.io.*
import atomictest.eq

val cleanup =
  File("Examples/ErrorReporting/Cleanup.kt")
  .bufferedReader()

fun main(args: Array<String>) {
  val lines = cleanup.use { it.readLines() }
  lines[0] eq "// ErrorReporting/Cleanup.kt"
}
