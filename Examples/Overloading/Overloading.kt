// Overloading/Overloading.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package overloading
import atomictest.eq

class Overloading {
  fun f() = 0
  fun f(n: Int) = n + 2
}

fun main() {
  val o = Overloading()
  o.f() eq 0
  o.f(11) eq 13
}
