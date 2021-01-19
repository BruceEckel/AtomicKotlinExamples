// Overloading/WithoutDefaultArguments.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package withoutdefaultarguments
import atomictest.eq

fun f(n: Int) = n + 373
fun f() = f(0)

fun main() {
  f() eq 373
}
