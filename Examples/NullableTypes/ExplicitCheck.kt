// NullableTypes/ExplicitCheck.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
import atomictest.eq

fun main() {
  val s: String? = "abc"
  if (s != null)
    s.length eq 3
}
