// nonNullAsserts/NonNullAssert.kt
import atomicTest.*

fun main(args: Array<String>) {
  val s1: String? = "abc"
  s1!! eq "abc"

  val s2: String? = null
  // Compiles, but produces a
  // KotlinNullPointerException:
  capture {
    val s3 = s2!!
  } eq "KotlinNullPointerException"
}
