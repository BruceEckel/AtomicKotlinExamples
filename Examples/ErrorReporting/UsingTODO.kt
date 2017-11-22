// ErrorReporting/UsingTODO.kt
import atomictest.*

fun later(s: String): String = TODO("Not Yet")

fun later2(s: String): String = TODO()

fun main(args: Array<String>) {
  capture {
    later("Hello")
  } eq "NotImplementedError"
  capture {
    later2("Hello!")
  } eq "NotImplementedError"
}
