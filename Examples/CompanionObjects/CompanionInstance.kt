// CompanionObjects/CompanionInstance.kt
package companionobjects
import atomictest.*

private val trace = Trace()

interface ZI {
  fun f(): String
  fun g(): String
}

class ZIImplementation {
  companion object: ZI {
    override fun f() = "ZIImplementation.f()"
    override fun g() = "ZIImplementation.g()"
  }
  fun u() = trace("${f()} ${g()}")
}

open class ZIOpen : ZI {
  override fun f() = "ZIOpen.f()"
  override fun g() = "ZIOpen.g()"
}

class ZICompanion {
  companion object: ZIOpen()
  fun u() = trace("${f()} ${g()}")
}

class ZICompanionInheritance {
  companion object: ZIOpen() {
    override fun g() =
      "ZICompanionInheritance.g()"
    fun h() = "ZICompanionInheritance.h()"
  }
  fun u() = trace("${f()} ${g()} ${h()}")
}

fun main() {
  ZIImplementation.f()
  ZIImplementation.g()
  ZIImplementation().u()
  ZICompanion.f()
  ZICompanion.g()
  ZICompanion().u()
  ZICompanionInheritance.f()
  ZICompanionInheritance.g()
  ZICompanionInheritance().u()
  trace eq """
  ZIImplementation.f() ZIImplementation.g()
  ZIOpen.f() ZIOpen.g()
  ZIOpen.f()
    ZICompanionInheritance.g()
    ZICompanionInheritance.h()
  """
}
