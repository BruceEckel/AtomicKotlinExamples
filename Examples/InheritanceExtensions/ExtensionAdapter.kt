// InheritanceExtensions/ExtensionAdapter.kt
package inheritanceextensions3
import usefullibrary.*

open class MyClass {
  fun g() {}
  fun h() {}
}

fun useMyClass(mc: MyClass) {
  mc.g()
  mc.h()
}

fun MyClass.f1() = h()
fun MyClass.f2() = g()

class MyClassAdaptedForLib : MyClass(), LibType {
  override fun f1() = super.f1()
  override fun f2()
}

fun main() {
  val library = UsefulLibrary()
  val mc = MyClassAdaptedForLib()
  library.utility1(mc)
  library.utility2(mc)
  useMyClass(mc)
}
