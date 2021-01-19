// CreatingGenerics/NonGenericConstraint.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package creatinggenerics
import atomictest.eq

fun nameOf2(disposable: Disposable) =
  disposable.name

fun Disposable.name2() = name

fun main() {
  recyclables.map { nameOf2(it) } eq
    "[Plastic, Metal, Cardboard]"
  recyclables.map { it.name2() } eq
    "[Plastic, Metal, Cardboard]"
}
