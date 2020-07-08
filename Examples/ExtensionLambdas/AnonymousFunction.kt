// ExtensionLambdas/AnonymousFunction.kt
package extensionlambdas
import atomictest.eq

fun main() {
  val divides = fun Int.(d: Int): Boolean {
    return this % d == 0
  }
  10.divides(2) eq true
  10.divides(3) eq false
}
