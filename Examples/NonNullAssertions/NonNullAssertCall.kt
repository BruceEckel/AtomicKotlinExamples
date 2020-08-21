// NonNullAssertions/NonNullAssertCall.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
import atomictest.eq

fun main() {
  val s1: String? = "abc"
  s1!!.length eq 3
}
