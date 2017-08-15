// nonNullAssertedCalls/NonNullAssertedCalls.kt
import atomicTest.eq

fun main(args: Array<String>) {
  val s1: String? = "abc"
  s1!!.length eq 3

  val s2: String? = null
  // Throws KotlinNullPointerException:
  // s2!!.length
}
