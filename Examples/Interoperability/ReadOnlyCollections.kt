// Interoperability/ReadOnlyCollections.kt
// ©2020 Mindview LLC. See Copyright.txt for permissions.
package interop
import atomictest.eq

fun main() {
  val mutable = mutableListOf(1, 2, 3)
  // Read-only reference to a mutable list:
  val list: List<Int> = mutable
  mutable += 4
  // list has changed:
  list eq "[1, 2, 3, 4]"
}
