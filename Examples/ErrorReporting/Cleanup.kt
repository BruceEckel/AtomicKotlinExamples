// ErrorReporting/Cleanup.kt
import errorreporting.*
import atomictest.eq

fun main(args: Array<String>) {
  localFile("Cleanup.kt").bufferedReader()
  .use { it.readLines().first() } eq
  "// ErrorReporting/Cleanup.kt"
}
