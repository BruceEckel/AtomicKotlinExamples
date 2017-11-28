// ErrorReporting/UsingTODO.kt
import atomictest.*

fun later(s: String): String = TODO("later()")

fun later2(s: String): String = TODO()

fun main(args: Array<String>) {
  stacktrace1 {
    later("Hello")
  } eq """NotImplementedError:
  An operation is not implemented: later()"""
  stacktrace1 {
    later2("Hello!")
  } eq """NotImplementedError:
  An operation is not implemented."""
}
