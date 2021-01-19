// IntroGenerics/GenericFunction.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package introgenerics
import atomictest.eq

fun <T> identity(arg: T): T = arg

fun main() {
  identity("Yellow") eq "Yellow"
  identity(1) eq 1
  val d: Dog = identity(Dog())
  d.bark() eq "Ruff!"
}
