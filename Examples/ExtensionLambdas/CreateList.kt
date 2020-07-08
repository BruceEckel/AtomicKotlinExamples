// ExtensionLambdas/CreateList.kt
package extensionlambdas
import atomictest.eq

fun <E> createList(
  build: MutableList<E>.() -> Unit
): List<E> {                            // [2]
  val list = mutableListOf<E>()
  list.build()
  return list
}

fun main() {
  val strings: List<String> = createList {
    add("Chars:")                       // [1]
    ('a'..'d').forEach { add("$it") }
    "Return value is ignored"
  }
  strings eq "[Chars:, a, b, c, d]"
}
