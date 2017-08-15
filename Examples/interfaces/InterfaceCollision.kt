// interfaces/InterfaceCollision.kt
import atomicTest.eq

interface A {
  fun f() = 1.1
  fun g() = "A.g"
  val n: Int
    get() = 7
}

interface B {
  fun f() = 7.7
  fun g() = "B.g"
  val n: Int
    get() = 17
}

class C : A, B {
  override fun f() = 9.9
  override fun g() = super<A>.g()
  override val n: Int
    get() = super<A>.n + super<B>.n
}

fun main(args: Array<String>) {
  val c = C()
  c.f() eq 9.9
  c.g() eq "A.g"
  c.n eq 24
}
