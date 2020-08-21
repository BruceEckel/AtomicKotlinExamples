// Abstract/InterfaceCollision.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package collision
import atomictest.eq

interface A {
  fun f() = 1
  fun g() = "A.g"
  val n: Double
    get() = 1.1
}

interface B {
  fun f() = 2
  fun g() = "B.g"
  val n: Double
    get() = 2.2
}

class C : A, B {
  override fun f() = 0
  override fun g() = super<A>.g()
  override val n: Double
    get() = super<A>.n + super<B>.n
}

fun main() {
  val c = C()
  c.f() eq 0
  c.g() eq "A.g"
  c.n eq 3.3
}
