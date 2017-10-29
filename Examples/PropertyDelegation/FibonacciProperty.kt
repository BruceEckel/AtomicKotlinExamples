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

class Fibonacci {
  private var current = 0
  operator fun getValue(delegator: Any?,
    prop: KProperty<*>) = current
  operator fun setValue(delegator: Any?,
    prop: KProperty<*>, n: Int) {
    current = fibonacci(n)
  }
}

fun main(args: Array<String>) {
  var f by Fibonacci()
  f eq 0
  f = 22
  f eq 17711
  f = 23
  f eq 28657
}
