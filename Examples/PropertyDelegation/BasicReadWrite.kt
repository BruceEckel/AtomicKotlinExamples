// PropertyDelegation/BasicReadWrite.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package propertydelegation
import atomictest.eq
import kotlin.reflect.KProperty

class ReadWriteable(var i: Int) {
  var msg = ""
  var value: String by BasicReadWrite()
}

class BasicReadWrite {
  operator fun getValue(
    rw: ReadWriteable,
    property: KProperty<*>
  ) = "getValue: ${rw.i}"
  operator fun setValue(
    rw: ReadWriteable,
    property: KProperty<*>,
    s: String
  ) {
    rw.i = s.toIntOrNull() ?: 0
    rw.msg = "setValue to ${rw.i}"
  }
}

fun main() {
  val x = ReadWriteable(11)
  x.value eq "getValue: 11"
  x.value = "99"
  x.msg eq "setValue to 99"
  x.value eq "getValue: 99"
}
