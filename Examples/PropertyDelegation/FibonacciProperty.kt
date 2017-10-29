// PropertyDelegation/FibonacciProperty.kt
package propertydelegation
import atomictest.eq
import kotlin.reflect.KProperty

fun fibonacci(n: Int): Int {
  assert(n >= 0)
  return when(n) {
    0 -> 0
    1 -> 1
    else -> fibonacci(n-1) + fibonacci(n-2)
  }
}

fun main(args: Array<String>) {
  println(fibonacci(22))
}
