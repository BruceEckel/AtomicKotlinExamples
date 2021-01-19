// CreatingGenerics/CreatingGenericsSoln2.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package creatingGenericsExercise2
import creatinggenerics.Crate
import atomictest.eq

class CrateList<T> : ArrayList<Crate<T>>() {
  private class DecoratedCrate<T>(
    contents: T
  ) : Crate<T>(contents) {
    override fun toString() = "[${get()}]"
  }
  fun add(item: T) {
    add(DecoratedCrate(item))
  }
}

fun main() {
  val intCrates = CrateList<Int>()
  (0..7).forEach { intCrates.add(it) }
  intCrates eq
    "[[0], [1], [2], [3], [4], [5], [6], [7]]"
  val stringCrates = CrateList<String>()
  ('a'..'h').map { it.toString() }
    .forEach { stringCrates.add(it) }
  stringCrates eq
    "[[a], [b], [c], [d], [e], [f], [g], [h]]"
}
