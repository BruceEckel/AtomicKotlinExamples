// PropertyDelegation/Add.kt
package propertydelegation2
import atomictest.eq
import kotlin.reflect.KProperty

class Add(val a: Int, val b: Int) {
  val sum by Sum()
}

class Sum

operator fun Sum.getValue(
  thisRef: Add, property: KProperty<*>
) = thisRef.a + thisRef.b

fun main() {
  val person = Add(144, 12)
  person.sum eq 156
}
