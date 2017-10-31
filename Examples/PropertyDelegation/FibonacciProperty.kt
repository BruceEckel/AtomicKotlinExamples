// PropertyDelegation/FibonacciProperty.kt
import atomictest.eq
import kotlin.reflect.KProperty
import bigint.*
import recursion.fibonacci

class Fibonacci {
  private var current: BigInt = zero
  operator fun getValue(dgtor: Any?,
    prop: KProperty<*>) = current
  operator fun setValue(dgtor: Any?,
    prop: KProperty<*>, n: BigInt) {
    current = fibonacci(n.toInt())
  }
}

fun main(args: Array<String>) {
  var f by Fibonacci()
  f eq 0.big
  f = 22.big
  f eq 17711.big
  f = 100.big
  f eq "354224848179261915075".big
}
