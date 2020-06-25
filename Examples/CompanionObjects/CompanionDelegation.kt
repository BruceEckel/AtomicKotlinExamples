// CompanionObjects/CompanionDelegation.kt
package companionobjects
import atomictest.*

class ZIClosed: ZI {
  override fun f() = "ZIClosed.f()"
  override fun g() = "ZIClosed.g()"
}

class ZIDelegation {
  companion object: ZI by ZIClosed()
  fun u() = trace("${f()} ${g()}")
}

class ZIDelegationInheritance {
  companion object: ZI by ZIClosed() {
    override fun g() =
      "ZIDelegationInheritance.g()"
    fun h() =
      "ZIDelegationInheritance.h()"
  }
  fun u() = trace("${f()} ${g()} ${h()}")
}

fun main() {
  ZIDelegation.f()
  ZIDelegation.g()
  ZIDelegation().u()
  ZIDelegationInheritance.f()
  ZIDelegationInheritance.g()
  ZIDelegationInheritance().u()
  trace eq """
    ZIClosed.f() ZIClosed.g()
    ZIClosed.f()
    ZIDelegationInheritance.g()
    ZIDelegationInheritance.h()
    """
}
