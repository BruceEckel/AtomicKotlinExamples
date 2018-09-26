// NonNullAssertions/NonNullAssertCall.kt
import atomictest.eq

fun main() {
  val s1: String? = "abc"
  s1!!.length eq 3
}
