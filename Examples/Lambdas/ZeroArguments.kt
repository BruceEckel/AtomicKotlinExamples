// Lambdas/ZeroArguments.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
import atomictest.*

fun main() {
  run { -> trace("A Lambda") }
  run { trace("Without args") }
  trace eq """
    A Lambda
    Without args
  """
}
