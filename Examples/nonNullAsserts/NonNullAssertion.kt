// nonNullAsserts/NonNullAssertion.kt
import atomicTest.eq

fun main(args: Array<String>) {
  val s: String? = "abc"
  s!! eq "abc"
}
