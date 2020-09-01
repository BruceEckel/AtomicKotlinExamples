// NullableExtensions/Definition.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package nullableextensions
import atomictest.eq

fun String?.isNullOrEmpty(): Boolean =
  this == null || this.isEmpty()

fun main() {
  "".isNullOrEmpty() eq true
}
