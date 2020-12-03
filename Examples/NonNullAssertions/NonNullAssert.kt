// NonNullAssertions/NonNullAssert.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
import atomictest.*

fun main() {
  var x: String? = "abc"
  x!! eq "abc"
  x = null
  capture {
    val s: String = x!!
  } eq "NullPointerException"
}
