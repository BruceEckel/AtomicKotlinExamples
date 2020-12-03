// NonNullAssertions/NonNullAssertCall.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
import atomictest.eq

fun main() {
  val s: String? = "abc"
  s!!.length eq 3
}
