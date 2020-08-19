// Interoperability/HiddenArrayList.kt
// ©2020 Mindview LLC. See Copyright.txt for permissions.
package interop
import atomictest.eq

fun main() {
  val list = mutableListOf(1, 2, 3)
  list.javaClass.name eq
    "java.util.ArrayList"
}
