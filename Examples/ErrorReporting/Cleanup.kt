// ErrorReporting/Cleanup.kt
import atomictest.eq
import errorreporting.localFile

fun main(args: Array<String>) {
  localFile("Cleanup.kt").bufferedReader()
    .use { it.readLines().first() } eq
    "// ErrorReporting/Cleanup.kt"
}
