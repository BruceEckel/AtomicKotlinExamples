// ExtensionProperties/StringIndices.kt
// ©2020 Mindview LLC. See Copyright.txt for permissions.
package extensionproperties
import atomictest.eq

val String.indices: IntRange
  get() = 0 until length

fun main() {
  "abc".indices eq 0..2
}
