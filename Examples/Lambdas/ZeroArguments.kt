// Lambdas/ZeroArguments.kt
import atomictest.eq

fun main() {
  run { -> println("A Lambda") }
  run { println("Without args") }
}
/* Output:
A Lambda
Without args
*/
