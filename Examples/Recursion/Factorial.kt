// Recursion/Factorial.kt
// ©2020 Mindview LLC. See Copyright.txt for permissions.
package recursion
import atomictest.eq

fun factorial(n: Long): Long {
  if (n <= 1) return 1
  return n * factorial(n - 1)
}

fun main() {
  factorial(5) eq 120
  factorial(17) eq 355687428096000
}
