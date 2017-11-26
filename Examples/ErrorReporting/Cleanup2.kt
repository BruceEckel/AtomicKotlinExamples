// ErrorReporting/Cleanup2.kt
import errorreporting.*
import atomictest.eq

fun main(args: Array<String>) {
  localFile("Cleanup2.kt").useLines {
    it.filter { "//" in it }.first()    // [1]
  } eq "// ErrorReporting/Cleanup2.kt"

  localFile("Cleanup2.kt").useLines {
    lines -> lines.filter {             // [2]
      line -> "//" in line
    }.first()
  } eq "// ErrorReporting/Cleanup2.kt"
}
