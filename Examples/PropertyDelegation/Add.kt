// PropertyDelegation/Add.kt
package propertydelegation2
import atomictest.eq
import kotlin.reflect.KProperty

class Add(val a: Int, val b: Int) {
  val sum by Sum()
}

class Sum

operator fun Sum.getValue(
  thisRef: Add,
  property: KProperty<*>
) = thisRef.a + thisRef.b

fun main() {
  val addition = Add(144, 12)
  addition.sum eq 156
}
