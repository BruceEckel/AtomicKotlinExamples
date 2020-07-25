// CreatingGenerics/Reification.kt
package creatinggenerics

fun <T> a(_class: Class<T>) {}

// Won't compile:
// fun <T> b() = a(T::class.java)

fun <T> c(_class: Class<T>) = a(_class)

inline fun <reified T> d() = a(T::class.java)

fun reification() {
  class K
  a(K::class.java)
  d<K>()
}
