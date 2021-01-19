// ExtensionProperties/GenericListExt.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package extensionproperties
import atomictest.eq

val <T> List<T>.firstOrNull: T?
  get() = if (isEmpty()) null else this[0]

fun main() {
  listOf(1, 2, 3).firstOrNull eq 1
  listOf<String>().firstOrNull eq null
}
