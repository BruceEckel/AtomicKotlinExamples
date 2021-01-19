// CreatingGenerics/CreatingGenericsSoln1.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package creatingGenericsExercise1
import atomictest.eq

fun interface Items<T> {
  fun next(): T?
}

fun <T> itemIter(vararg items: T): Items<T> {
  var index = 0
  return Items {
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
