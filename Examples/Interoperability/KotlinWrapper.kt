// interoperability/KotlinWrapper.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package interop

fun main() {
  // Generates a primitive int:
  val i = 10
  // Generates wrapper types:
  val iOrNull: Int? = null
  val list: List<Int> = listOf(1, 2, 3)
}
