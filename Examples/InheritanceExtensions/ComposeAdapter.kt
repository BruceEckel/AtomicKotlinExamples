// InheritanceExtensions/ComposeAdapter.kt
package inheritanceextensions2
import usefullibrary.*

class MyClass { // Not open
  fun g() {}
  fun h() {}
}

fun useMyClass(mc: MyClass) {
  mc.g()
  mc.h()
}

class MyClassAdaptedForLib : LibType {
  val field = MyClass()
  override fun f1() = field.h()
  override fun f2() = field.g()
}

fun main() {
  val library = UsefulLibrary()
  val mc = MyClassAdaptedForLib()
  library.utility1(mc)
  library.utility2(mc)
  useMyClass(mc.field)
}
