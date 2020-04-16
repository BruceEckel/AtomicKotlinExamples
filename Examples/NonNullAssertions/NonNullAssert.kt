// NonNullAssertions/NonNullAssert.kt
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
