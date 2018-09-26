// NullableTypes/ExplicitCheck.kt
import atomictest.eq

fun main() {
  val s: String? = "abc"
  if (s != null)
    s.length eq 3
}
