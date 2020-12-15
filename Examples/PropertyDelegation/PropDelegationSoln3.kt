// PropertyDelegation/PropDelegationSoln3.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package propertyDelegationExercise2
import atomictest.eq
import kotlin.reflect.KProperty

class Delegator {
  private var list = List(8) { "$it" }
  var strings: List<String> by list
  operator fun List<String>.getValue(
    r: Delegator,
    property: KProperty<*>
  ): List<String> = r.list
  operator fun List<String>.setValue(
    w: Delegator,
    property: KProperty<*>,
    list: List<String>
  ) {
    w.list = list
  }
}

fun main() {
  val x = Delegator()
  x.strings eq "[0, 1, 2, 3, 4, 5, 6, 7]"
  x.strings = listOf("99", "17")
  x.strings eq "[99, 17]"
}
