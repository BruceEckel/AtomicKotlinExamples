// DownCasting/NarrowingUpcast.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package downcasting

interface Base {
  fun f()
}

class Derived1 : Base {
  override fun f() {}
  fun g() {}
}

class Derived2 : Base {
  override fun f() {}
  fun h() {}
}

fun main() {
  val b1: Base = Derived1() // Upcast
  b1.f()    // Part of Base
  // b1.g() // Not part of Base
  val b2: Base = Derived2() // Upcast
  b2.f()    // Part of Base
  // b2.h() // Not part of Base
}
