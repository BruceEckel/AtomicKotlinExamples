// FunctionTypes/SimpleOperation.kt
import atomictest.eq

fun main() {
  val isPositive: (Int) -> Boolean =
    { it > 0 }
  val list = listOf(1, 2, -3)
  list.any(isPositive) eq true
}
