// NonNullAssertions/NonNullAssert.kt
import atomictest.*

fun main() {
  val s1: String? = "abc"
  s1!! eq "abc"

  val s2: String? = null
  // Compiles, but produces a
  // KotlinNullPointerException:
  capture {
    val s3: String = s2!!
  } eq "KotlinNullPointerException"
}
