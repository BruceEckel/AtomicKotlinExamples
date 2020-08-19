// CreatingGenerics/Constrained.kt
// ©2020 Mindview LLC. See Copyright.txt for permissions.
package creatinggenerics
import atomictest.eq

fun <T: Disposable> nameOf(disposable: T) =
  disposable.name

// As an extension:
fun <T: Disposable> T.name() = name

fun main() {
  recyclables.map { nameOf(it) } eq
    "[Plastic, Metal, Cardboard]"
  recyclables.map { it.name() } eq
    "[Plastic, Metal, Cardboard]"
}
