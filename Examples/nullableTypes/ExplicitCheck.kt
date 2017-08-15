// nullableTypes/ExplicitCheck.kt
import atomicTest.eq

fun main(args: Array<String>) {
  val s: String? = "abc"
  if (s != null) {
    s.length eq 3
  }
}
