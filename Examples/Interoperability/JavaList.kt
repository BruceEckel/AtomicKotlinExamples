// Interoperability/JavaList.kt
// ©2020 Mindview LLC. See Copyright.txt for permissions.
package interop
import atomictest.eq

fun main() {
  val list = listOf(1, 2, 3)
  (list is java.util.List<*>) eq true
}
