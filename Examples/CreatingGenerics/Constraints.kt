// CreatingGenerics/Constraints.kt
package creatinggenerics

fun <T> f(h: Crate<T>, t: T): T {
  h.add(t)
  return h.get()
}

fun <T, U: T> g(h: Crate<T>, u: U): T {
  h.add(u)
  return h.get()
}
