// InheritanceExtensions/NoExtOverride.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package inheritanceextensions
import atomictest.*

open class Base {
  open fun f() = "Base.f()"
}

class Derived: Base() {
  override fun f() = "Derived.f()"
}

fun Base.g() = "Base.g()"
fun Derived.g() = "Derived.g()"

fun useBase(b: Base) {
  trace("Received ${b::class.simpleName}")
  trace(b.f())
  trace(b.g())
}

fun main() {
  useBase(Base())
  useBase(Derived())
  trace eq """
    Received Base
    Base.f()
    Base.g()
    Received Derived
    Derived.f()
    Base.g()
  """
}
