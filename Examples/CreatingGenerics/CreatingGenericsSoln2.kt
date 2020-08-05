// CreatingGenerics/CreatingGenericsSoln2.kt
package creatinggenericssoln2
import creatinggenerics.Crate
import atomictest.eq

class CrateList<T> : ArrayList<Crate<T>>() {
  private class
  DecoratedCrate<T>(contents: T) :
    Crate<T>(contents) {
    override fun toString() = "[${get()}]"
  }
  fun add(item: T) {
    add(DecoratedCrate(item))
  }
}

fun main() {
  val crateList = CrateList<String>()
  ('a'..'h').map { it.toString() }
    .forEach { crateList.add(it) }
  crateList eq
    "[[a], [b], [c], [d], [e], [f], [g], [h]]"
}
