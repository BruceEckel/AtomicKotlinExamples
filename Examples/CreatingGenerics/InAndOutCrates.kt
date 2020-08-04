// CreatingGenerics/InAndOutCrates.kt
package creatinggenerics

class InCrate<in T>(private var item: T) {
  fun put(new: T) { item = new }
  // fun get(): T = item
}

class OutCrate<out T>(private var item: T) {
  // fun put(new: T) { item = new }
  fun get(): T = item
}
