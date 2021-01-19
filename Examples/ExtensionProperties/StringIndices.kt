// ExtensionProperties/StringIndices.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package extensionproperties
import atomictest.eq

val String.indices: IntRange
  get() = 0 until length

fun main() {
  "abc".indices eq 0..2
}
