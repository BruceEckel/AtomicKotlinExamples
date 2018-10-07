// Variance/InAndOut.kt
package variance

interface Hold<in T> {
  fun add(item: T)
  // fun get(): T
  // Error message:
  // Type parameter T is declared as 'in'
  // but occurs in 'out' position in type T
}

interface Produce<out T> {
  fun get(): T
  // fun add(item: T)
  // Error message:
  // Type parameter T is declared as 'out'
  // but occurs in 'in' position in type T
}

// fun <in GI> f(item: GI) = item.id()
// Error: variance annotations are only
// allowed for type parameters of
// classes and interfaces

fun main() {}
