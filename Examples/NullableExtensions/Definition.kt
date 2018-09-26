// NullableExtensions/Definition.kt
import atomictest.eq

fun String?.isNullOrEmpty(): Boolean =
  this == null || this.isEmpty()

fun main() {
  "".isNullOrEmpty() eq true
}
