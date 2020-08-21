// InheritanceExtensions/ComposeAdapter.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package inheritanceextensions2
import usefullibrary.*
import atomictest.*

class MyClass { // Not open
  fun g() = trace("g()")
  fun h() = trace("h()")
}

fun useMyClass(mc: MyClass) {
  mc.g()
  mc.h()
}

class MyClassAdaptedForLib: LibType {
  val field = MyClass()
  override fun f1() = field.h()
  override fun f2() = field.g()
}

fun main() {
  val mc = MyClassAdaptedForLib()
  utility1(mc)
  utility2(mc)
  useMyClass(mc.field)
  trace eq """
    h()
    g()
    g()
    h()
    g()
    h()
  """
}
