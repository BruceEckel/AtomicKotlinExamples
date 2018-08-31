// PropertyDelegation/FibonacciProperty.kt
import atomictest.eq
import recursion.fibonacci
import kotlin.reflect.KProperty

class Fibonacci {
  private var current: Long = 0
  operator fun getValue(
    dgtor: Any?,
    prop: KProperty<*>
  ) = current

  operator fun setValue(
    dgtor: Any?,
    prop: KProperty<*>,
    n: Long
  ) {
    current = fibonacci(n.toInt())
  }
}

fun main(args: Array<String>) {
  var f by Fibonacci()
  f eq 0L
  f = 22L
  f eq 17711L
  f = 90L
  f eq 2880067194370816120L
}
