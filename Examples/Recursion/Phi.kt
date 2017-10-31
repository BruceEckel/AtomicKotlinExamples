// Recursion/Phi.kt
import atomictest.eq
import recursion.fibonacci
import bigint.*

// Phi calculated directly:
val Phi = (1 + Math.sqrt(5.0))/2

// Phi using continued fractions:
fun phiCF(depth: Int): Double {
  if(depth == 0) return 2.0
  return 1 + 1 / phiCF(depth - 1)
}

// Phi using Fibonacci division:
fun phiFib(depth: Int): Double =
  fibonacci(depth).toDouble() /
    fibonacci(depth - 1).toDouble()

// Recursively try an algorithm:
fun checkPhi(phi: (Int) -> Double,
  depth: Int = 1): Int {
  if(phi(depth) == Phi)
    return depth
  else
    return checkPhi(phi, depth + 1)
}

fun main(args: Array<String>) {
  // Continued fractions:
  checkPhi(::phiCF) eq 37
  // Fibonacci:
  checkPhi(::phiFib) eq 41
}
