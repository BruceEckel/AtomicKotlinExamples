// CreatingGenerics/CreatingGenericsSoln1.kt
package creatinggenericssoln1
import atomictest.eq

interface Items<T> {
  fun next(): T?
}

fun <T> itemIter(vararg items: T): Items<T> {
  return object : Items<T> {
    private var index = 0
    override fun next(): T? =
      if (index >= items.size) null
      else items[index++]
  }
}

fun main() {
  val s = itemIter("A", "B", "C")
  (0..3).map { s.next() } eq "[A, B, C, null]"
  val i = itemIter(1, 2, 3, 4, 5, 6, 7)
  (0..10).mapNotNull { i.next() } eq
    "[1, 2, 3, 4, 5, 6, 7]"
}
