// CompanionObjects/DelegateAndExtend.kt
package companionobjects
import atomictest.*

private val trace = Trace()

interface Extended : ZI {
  fun u()
}

class ExtendBy : ZI by Companion, Extended {
  companion object: ZI {
    override fun f() = "ExtendBy.f()"
    override fun g() = "ExtendBy.g()"
  }
  override fun u() = trace("${f()} ${g()}")
}

fun extended(e: Extended) {
  e.f()
  e.g()
  e.u()
}

fun main() {
  extended(ExtendBy())
}
