// NonNullAssertions/NonNullAssert.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
import atomictest.*

fun main() {
  val s1: String? = "abc"
  s1!! eq "abc"

  val s2: String? = null
  // Ignore nullability:
  capture {
    val s3: String = s2!!
  } eq "NullPointerException"
}
