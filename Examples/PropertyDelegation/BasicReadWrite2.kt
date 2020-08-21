// PropertyDelegation/BasicReadWrite2.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package propertydelegation
import atomictest.eq
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class ReadWriteable2(var i: Int) {
  var msg = ""
  var value: String by BasicReadWrite2()
}

class BasicReadWrite2:
  ReadWriteProperty<ReadWriteable2, String> {
  override operator fun getValue(
    rw: ReadWriteable2,
    property: KProperty<*>
  ) = "getValue: ${rw.i}"
  override operator fun setValue(
    rw: ReadWriteable2,
    property: KProperty<*>,
    s: String
  ) {
    rw.i = s.toIntOrNull() ?: 0
    rw.msg = "setValue to ${rw.i}"
  }
}

fun main() {
  val x = ReadWriteable2(11)
  x.value eq "getValue: 11"
  x.value = "99"
  x.msg eq "setValue to 99"
  x.value eq "getValue: 99"
}
