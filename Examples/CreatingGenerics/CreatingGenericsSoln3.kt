// CreatingGenerics/CreatingGenericsSoln3.kt
package creatinggenericssoln3

interface InCrate<in T> {
  fun put(item: T)
}

interface OutCrate<out T> {
  fun get(): T
}

class Crate<T>(private var contents: T): InCrate<T>, OutCrate<T> {
  override fun put(item: T) { contents = item }
  override fun get(): T = contents
}
