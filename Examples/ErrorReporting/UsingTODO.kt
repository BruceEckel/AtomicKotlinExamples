// ErrorReporting/UsingTODO.kt
import atomictest.*

fun later(s: String): String = TODO("later()")

fun later2(s: String): String = TODO()

fun main(args: Array<String>) {
  capture {
    later("Hello")
  } eq "NotImplementedError: " +
    "An operation is not implemented: later()"
  capture {
    later2("Hello!")
  } eq "NotImplementedError: " +
    "An operation is not implemented."
}
