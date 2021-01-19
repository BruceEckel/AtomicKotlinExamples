// NullableExtensions/NullableParameter.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package nullableextensions
import atomictest.eq

fun isNullOrEmpty(s: String?): Boolean =
  s == null || s.isEmpty()

fun main() {
  isNullOrEmpty(null) eq true
  isNullOrEmpty("") eq true
}
