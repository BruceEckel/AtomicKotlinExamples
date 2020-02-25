// CompanionObjects/CompanionDelegation.kt
package companionobjects
import atomictest.*

private val trace = Trace()

class ZIClosed : ZI {
  override fun f() = "ZClosed.f()"
  override fun g() = "ZClosed.g()"
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
  ZClosed.f() ZClosed.g()
  ZClosed.f()
    ZIDelegationInheritance.g()
    ZIDelegationInheritance.h()
  """
}
