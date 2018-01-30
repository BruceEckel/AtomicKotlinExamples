// WhenExpressions/MixColors.kt
import atomictest.eq

fun mixColors(first: String, second: String) =
  when (setOf(first, second)) {
    setOf("red", "blue") -> "purple"
    setOf("red", "yellow") -> "orange"
    setOf("blue", "yellow") -> "green"
    else -> "unknown"
  }

fun main(args: Array<String>) {
  mixColors("blue", "red") eq "purple"
  mixColors("blue", "purple") eq "unknown"
}
