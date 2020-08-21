// CreatingGenerics/InAndOutCrates.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package creatinggenerics

class InCrate<in T>(private var contents: T) {
  fun put(item: T) { contents = item }
  // fun get(): T = contents
}

class OutCrate<out T>(private var contents: T) {
  // fun put(item: T) { contents = item }
  fun get(): T = contents
}
