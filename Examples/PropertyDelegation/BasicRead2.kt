// PropertyDelegation/BasicRead2.kt
package propertydelegation
import atomictest.eq
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

class Readable2(val i: Int) {
  val value: String by BasicRead2()
  // SAM conversion:
  val value2: String by
  ReadOnlyProperty { _, _ -> "getValue: $i" }
}

class BasicRead2 :
  ReadOnlyProperty<Readable2, String> {
  override operator fun getValue(
    thisRef: Readable2,
    property: KProperty<*>
  ) = "getValue: ${thisRef.i}"
}

fun main() {
  val x = Readable2(11)
  val y = Readable2(17)
  x.value eq "getValue: 11"
  x.value2 eq "getValue: 11"
  y.value eq "getValue: 17"
  y.value2 eq "getValue: 17"
}
