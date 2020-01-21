// Polymorphism/PolyExercise3.kt
package polymorphism
import atomictest.*

private val trace = Trace()

open class Base {
  open fun f1() {
    trace("Base.f1")
    f2()
  }
  open fun f2() = trace("Base.f2")
}

class Derived : Base() {
  override fun f1() {
    trace("Derived.f1")
    super.f1()
  }
  override fun f2() {
    trace("Derived.f2")
    super.f2()
  }
}

fun main() {
  val base: Base = Derived()
  base.f1()
  trace eq """
  Derived.f1
  Base.f1
  Derived.f2
  Base.f2
  """
}
