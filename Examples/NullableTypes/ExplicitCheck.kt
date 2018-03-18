// NullableTypes/ExplicitCheck.kt
import atomictest.eq

fun main(args: Array<String>) {
  val s: String? = "abc"
  if (s != null)
    s.length eq 3
}
