// CompanionObjects/CompanionInstance.kt
package companionobjects
import atomictest.eq

interface ZI {
  fun f(): String
  fun g(): String
}

open class ZOpen : ZI {
  override fun f() = "ZOpen.f()"
  override fun g() = "ZOpen.g()"
}

class WithZCompanion {
  companion object: ZOpen()
  fun u() = "u(): ${f()} ${g()}"
}

class ZClosed : ZI {
  override fun f() = "ZClosed.f()"
  override fun g() = "ZClosed.g()"
}

class ZIDelegation {
  companion object: ZI by ZClosed()
  fun v() = "v(): ${f()} ${g()}"
}

fun main() {
  WithZCompanion.f()
  WithZCompanion.g()
  WithZCompanion().u() eq
    "u(): ZOpen.f() ZOpen.g()"
  ZIDelegation.f()
  ZIDelegation.g()
  ZIDelegation().v() eq
    "v(): ZClosed.f() ZClosed.g()"
}
