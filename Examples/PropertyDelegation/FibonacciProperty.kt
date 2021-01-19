// PropertyDelegation/FibonacciProperty.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package propertydelegation
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty
import recursion.fibonacci
import atomictest.eq

class Fibonacci :
  ReadWriteProperty<Any?, Long> {
  private var current: Long = 0
  override operator fun getValue(
    thisRef: Any?,
    property: KProperty<*>
  ) = current
  override operator fun setValue(
    thisRef: Any?,
    property: KProperty<*>,
    value: Long
  ) {
    current = fibonacci(value.toInt())
  }
}

fun main() {
  var fib by Fibonacci()
  fib eq 0L
  fib = 22L
  fib eq 17711L
  fib = 90L
  fib eq 2880067194370816120L
}
