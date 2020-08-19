// NullableExtensions/Definition.kt
// ©2020 Mindview LLC. See Copyright.txt for permissions.
import atomictest.eq

fun String?.isNullOrEmpty(): Boolean =
  this == null || this.isEmpty()

fun main() {
  "".isNullOrEmpty() eq true
}
