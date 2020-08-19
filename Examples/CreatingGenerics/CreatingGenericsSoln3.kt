// CreatingGenerics/CreatingGenericsSoln3.kt
// ©2020 Mindview LLC. See Copyright.txt for permissions.
package creatinggenericssoln3
import creatinggenerics.Can
import creatinggenerics.Grape

interface InCrate<in T> {
  fun put(item: T)
}

interface OutCrate<out T> {
  fun get(): T
}

class Crate<T>(private var contents: T) :
  InCrate<T>, OutCrate<T> {
  override fun put(item: T) {
    contents = item
  }
  override fun get(): T = contents
}

fun main() {
  val cg: Crate<Grape> = Crate(Grape())
  val oc: OutCrate<Can> = cg
  val cc: Crate<Can> = Crate(Can())
  val ic: InCrate<Grape> = cc
}
