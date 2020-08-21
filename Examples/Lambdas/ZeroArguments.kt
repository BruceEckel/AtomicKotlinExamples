// Lambdas/ZeroArguments.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
import atomictest.eq

fun main() {
  run { -> println("A Lambda") }
  run { println("Without args") }
}
/* Output:
A Lambda
Without args
*/
