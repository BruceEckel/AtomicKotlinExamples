// Recursion/Factorials.kt
import atomictest.eq

fun factorialInt(n: Int): Int {
  assert(n >= 0)
  if (n <= 1)
    return 1
  return n * factorialInt(n - 1)
}

fun factorialLong(n: Long): Long {
  assert(n >= 0)
  if (n <= 1)
    return 1
  return n * factorialLong(n - 1)
}

fun main(args: Array<String>) {
  factorialInt(12) eq 479001600
  factorialInt(17) eq -288522240
  factorialLong(17) eq 355687428096000
  factorialLong(30) eq -8764578968847253504
}
