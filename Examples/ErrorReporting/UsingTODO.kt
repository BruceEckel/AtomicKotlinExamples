// ErrorReporting/UsingTODO.kt
import atomictest.*

fun later(s: String): String = TODO("Not Yet")

fun later2(s: String): String = TODO()

fun main(args: Array<String>) {
  stacktrace1 {
    later("Hello")
  } eq """NotImplementedError:
  An operation is not implemented: Not Yet"""
  stacktrace1 {
    later2("Hello!")
  } eq """NotImplementedError:
  An operation is not implemented."""
}
