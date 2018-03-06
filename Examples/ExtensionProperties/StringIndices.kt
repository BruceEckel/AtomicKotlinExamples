// ExtensionProperties/StringIndices.kt
package extensionproperties
import atomictest.eq

val String.indices: IntRange
  get() = 0 until length

fun main(args: Array<String>) {
  "abc".indices eq 0..2
}
