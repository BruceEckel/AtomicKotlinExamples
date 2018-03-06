// ExtensionProperties/Indices.kt
package extensionproperties
import atomictest.eq

fun main(args: Array<String>) {
  val list: List<*> = listOf(1, 2)
  val any: Any? = list[0]
  any eq 1
  // Doesn't compile:
  // any + 1
}
