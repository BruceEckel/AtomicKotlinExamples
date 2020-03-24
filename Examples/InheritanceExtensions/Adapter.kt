// InheritanceExtensions/Adapter.kt
package inheritanceextensions
import usefullibrary.*
import atomictest.*

private val trace = Trace()

open class MyClass {
  fun g() = trace("g()")
  fun h() = trace("h()")
}

fun useMyClass(mc: MyClass) {
  mc.g()
  mc.h()
}

class MyClassAdaptedForLib :
  MyClass(), LibType {
  override fun f1() = h()
  override fun f2() = g()
}

fun main() {
  val library = UsefulLibrary()
  val mc = MyClassAdaptedForLib()
  library.utility1(mc)
  library.utility2(mc)
  useMyClass(mc)
  trace eq """
  h()
  g()
  g()
  h()
  g()
  h()
  """
}
