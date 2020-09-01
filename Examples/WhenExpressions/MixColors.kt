// WhenExpressions/MixColors.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package whenexpressions
import atomictest.eq

fun mixColors(first: String, second: String) =
  when (setOf(first, second)) {
    setOf("red", "blue") -> "purple"
    setOf("red", "yellow") -> "orange"
    setOf("blue", "yellow") -> "green"
    else -> "unknown"
  }

fun main() {
  mixColors("red", "blue") eq "purple"
  mixColors("blue", "red") eq "purple"
  mixColors("blue", "purple") eq "unknown"
}
