// ExtensionProperties/GenericListExt.kt
package extensionproperties
import atomictest.eq

fun <T> List<T>.first(): T {
  if (isEmpty())
    throw
      NoSuchElementException("Empty List.")
  return this[0]
}

val <T> List<T>.firstOrNull: T?
  get() = if (isEmpty()) null else this[0]

fun main() {
  listOf(1, 2, 3).first() eq 1
  listOf(1, 2, 3).firstOrNull eq 1
  listOf<String>().firstOrNull eq null
}
