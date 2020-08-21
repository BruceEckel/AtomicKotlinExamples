// NullableTypes/Dereference.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
import atomictest.eq

fun main() {
  val s1: String = "abc"
  val s2: String? = s1

  s1.length eq 3          // [1]
  // Doesn't compile:
  // s2.length            // [2]
}
