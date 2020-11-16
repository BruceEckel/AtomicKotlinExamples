// Interoperability/PrimitiveVsWrapperK.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package interop

fun main() {
  // primitive int under the hood
  val i = 10
  // wrapper types under the hood
  val iOrNull: Int? = null
  val list: List<Int> = listOf(1, 2, 3)
}
