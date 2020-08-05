// CreatingGenerics/InAndOutCrates.kt
package creatinggenerics

class InCrate<in T>(private var contents: T) {
  fun put(item: T) { contents = item }
  // fun get(): T = contents
}

class OutCrate<out T>(private var contents: T) {
  // fun put(item: T) { contents = item }
  fun get(): T = contents
}
