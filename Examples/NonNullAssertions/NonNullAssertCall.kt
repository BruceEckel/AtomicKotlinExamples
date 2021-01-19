// NonNullAssertions/NonNullAssertCall.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
import atomictest.eq

fun main() {
  val s: String? = "abc"
  s!!.length eq 3
}
