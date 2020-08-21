// PropertyDelegation/PropDelegationSoln2.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package propertydelegationsoln2
import atomictest.eq
import kotlin.reflect.KProperty

class Add(var a: Int, val b: Int) {
  var sum by Sum()
}

class Sum

operator fun Sum.getValue(
  thisRef: Add, property: KProperty<*>
) = thisRef.a + thisRef.b

operator fun Sum.setValue(
  thisRef: Add, property: KProperty<*>,
  value: Int
) {
  thisRef.a = value
}

fun main() {
  val addition = Add(144, 12)
  addition.sum eq 156
  addition.sum = 10
  addition.sum eq 22
}
