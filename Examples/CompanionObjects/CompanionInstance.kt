// CompanionObjects/CompanionInstance.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package companionobjects
import atomictest.*

interface ZI {
  fun f(): String
  fun g(): String
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

class ZIClass {
  companion object: ZI {
    override fun f() = "ZIClass.f()"
    override fun g() = "ZIClass.g()"
  }
  fun u() = trace("${f()} ${g()}")
}

fun main() {
  ZIClass.f()
  ZIClass.g()
  ZIClass().u()
  ZICompanion.f()
  ZICompanion.g()
  ZICompanion().u()
  ZICompanionInheritance.f()
  ZICompanionInheritance.g()
  ZICompanionInheritance().u()
  trace eq """
    ZIClass.f() ZIClass.g()
    ZIOpen.f() ZIOpen.g()
    ZIOpen.f()
    ZICompanionInheritance.g()
    ZICompanionInheritance.h()
  """
}
