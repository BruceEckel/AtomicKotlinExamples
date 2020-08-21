// NullableExtensions/NullableParameter.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
import atomictest.eq

fun isNullOrEmpty(s: String?): Boolean =
  s == null || s.isEmpty()

fun main() {
  isNullOrEmpty(null) eq true
  isNullOrEmpty("") eq true
}
