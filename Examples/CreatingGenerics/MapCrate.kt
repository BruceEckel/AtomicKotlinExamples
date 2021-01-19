// CreatingGenerics/MapCrate.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package creatinggenerics
import atomictest.eq

fun <T, R> Crate<T>.map(f:(T) -> R): List<R> =
  listOf(f(get()))

fun main() {
  Crate(Car()).map { it.toString() + "x" } eq
    "[Carx]"
}
