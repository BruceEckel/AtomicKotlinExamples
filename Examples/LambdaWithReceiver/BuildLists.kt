// LambdaWithReceiver/BuildLists.kt
package buildinglists
import atomictest.eq

fun main() {
  val strings: List<String> = buildList {
    add("Chars:")                       // [1]
    for (ch in 'a'..'d') {
      add("$ch")
    }
  }
  strings eq
    listOf("Chars:", "a", "b", "c", "d")
}

fun <E> buildList(
  builderAction: MutableList<E>.() -> Unit
): List<E> {                            // [2]
  val list = mutableListOf<E>()
  list.builderAction()
  return list
}
