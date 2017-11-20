// ErrorReporting/Cleanup2.kt
import java.io.*
import atomictest.eq

val cleanup2 =
  File("Examples/ErrorReporting/Cleanup2.kt")

fun main(args: Array<String>) {
  cleanup2.useLines {
    it.filter { "//" in it  }.first() eq
    "// ErrorReporting/Cleanup2.kt"
  }
}
