// NothingType/Todo.kt
// ©2020 Mindview LLC. See Copyright.txt for permissions.
package nothingtype
import atomictest.*

fun later(s: String): String = TODO("later()")

fun later2(s: String): Int = TODO()

fun main() {
  capture {
    later("Hello")
  } eq "NotImplementedError: " +
    "An operation is not implemented: later()"
  capture {
    later2("Hello!")
  } eq "NotImplementedError: " +
    "An operation is not implemented."
}
