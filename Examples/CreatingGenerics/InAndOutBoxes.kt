// CreatingGenerics/InAndOutBoxes.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package variance

class Box<T>(private var contents: T) {
  fun put(item: T) { contents = item }
  fun get(): T = contents
}

class InBox<in T>(private var contents: T) {
  fun put(item: T) { contents = item }
}

class OutBox<out T>(private var contents: T) {
  fun get(): T = contents
}
