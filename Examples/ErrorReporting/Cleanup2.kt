// ErrorReporting/Cleanup2.kt
import errorreporting.*
import atomictest.eq

fun main(args: Array<String>) {
  localFile("Cleanup2.kt").useLines {
    it.filter { "//" in it }.first() eq // [1]
    "// ErrorReporting/Cleanup2.kt"
  }
}
