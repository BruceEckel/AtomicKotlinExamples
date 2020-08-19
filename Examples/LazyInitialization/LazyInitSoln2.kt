// LazyInitialization/LazyInitSoln2.kt
// ©2020 Mindview LLC. See Copyright.txt for permissions.
package lazyinitsoln2
import atomictest.*

class Outer {
  init {
    trace("Outer constructor")
  }
  val s1: String by lazy {
    trace("Initializing Outer.s1")
    "Hi"
  }
  val s2: String by lazy {
    trace("Initializing Outer.s2")
    "Hello $s1"
  }
  inner class Inner {
    init {
      trace("Inner constructor")
    }
    val si: String by lazy {
      trace("Initializing Inner.si")
      "Howdy $s2"
    }
  }
}

fun main() {
  val o = Outer()
  trace("Outer created")
  val inner = o.Inner()
  trace("Inner created")
  trace("First access: inner.si:")
  trace(inner.si)
  trace("Second access: inner.si:")
  trace(inner.si)
  trace eq """
    Outer constructor
    Outer created
    Inner constructor
    Inner created
    First access: inner.si:
    Initializing Inner.si
    Initializing Outer.s2
    Initializing Outer.s1
    Howdy Hello Hi
    Second access: inner.si:
    Howdy Hello Hi
  """
}
