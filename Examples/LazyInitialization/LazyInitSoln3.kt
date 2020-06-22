// LazyInitialization/LazyInitSoln3.kt
package lazyinitsoln3
import atomictest.*

private val trace = Trace()

class A {
  init {
    trace("A constructor")
  }
  val b by lazy {
    trace("Initializing A.b")
    B()
  }
  val i by lazy {
    trace("Initializing A.i")
    1
  }
  fun f() = i + b.g()
}

class B {
  init {
    trace("B constructor")
  }
  val j by lazy {
    trace("Initializing B.j")
    2
  }
  fun g() = j
}

fun main() {
  val a by lazy {
    trace("Initializing A")
    A()
  }
  trace("'a' defined")
  trace(a.f())
  trace eq """
    'a' defined
    Initializing A
    A constructor
    Initializing A.i
    Initializing A.b
    B constructor
    Initializing B.j
    3
  """
}
