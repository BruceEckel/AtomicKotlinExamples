// CreatingGenerics/CreatingGenericsSoln1.kt
package creatinggenericssoln1
import atomictest.eq

interface Items<T> {
  fun next(): T?
}

class ItemsFactory<T> {
  private var index = 0
  fun new(vararg items: T): Items<T> {
    return object : Items<T> {
      override fun next(): T? =
        if (index >= items.size) null
        else items[index++]
    }
  }
}

fun main() {
  val s =
    ItemsFactory<String>().new("A", "B", "C")
  (0..3).map { s.next() } eq "[A, B, C, null]"
  val i = ItemsFactory<Int>().new(1, 2, 3)
  (0..3).map { i.next() }
    .filterNotNull() eq "[1, 2, 3]"
}
