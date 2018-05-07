// Lambdas/ZeroArguments.kt
import atomictest.eq

fun main(args: Array<String>) {
  run { -> println("A Lambda") }
  run { println("Without args") }
}
/* Output:
A Lambda
Without args
*/
