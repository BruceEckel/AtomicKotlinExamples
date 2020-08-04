// CreatingGenerics/Constraints.kt
package creatinggenerics

fun <T> f(h: Crate<T>, t: T): T {
  h.put(t)
  return h.get()
}

fun <T, U: T> g(h: Crate<T>, u: U): T {
  h.put(u)
  return h.get()
}
