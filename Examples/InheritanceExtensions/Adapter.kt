// InheritanceExtensions/Adapter.kt
package inheritanceextensions
import alibrary.*

open class MyClass {
  fun g() {}
  fun h() {}
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
  val library = ALibrary()
  val mc = MyClassAdaptedForLib()
  library.utility1(mc)
  library.utility2(mc)
  useMyClass(mc)
}
