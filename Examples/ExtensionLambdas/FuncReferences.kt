// ExtensionLambdas/FuncReferences.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package extensionlambdas
import atomictest.eq

fun Int.d1(f: (Int) -> Int) = f(this) * 10

fun Int.d2(f: Int.() -> Int) = f() * 10

fun f1(n: Int) = n + 3
fun Int.f2() = this + 3

fun main() {
  74.d1(::f1) eq 770
  74.d2(::f1) eq 770
  74.d1(Int::f2) eq 770
  74.d2(Int::f2) eq 770
}
