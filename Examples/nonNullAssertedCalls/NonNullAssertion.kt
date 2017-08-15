// nonNullAssertedCalls/NonNullAssertion.kt
import atomicTest.eq

fun main(args: Array<String>) {
  val s: String? = "abc"
  s!! eq "abc"

  // Throws KotlinNullPointerException:
  // null!!
}
