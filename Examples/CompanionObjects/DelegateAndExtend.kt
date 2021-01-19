// CompanionObjects/DelegateAndExtend.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package companionobjects
import atomictest.eq

interface Extended: ZI {
  fun u(): String
}

class Extend : ZI by Companion, Extended {
  companion object: ZI {
    override fun f() = "Extend.f()"
    override fun g() = "Extend.g()"
  }
  override fun u() = "${f()} ${g()}"
}

private fun test(e: Extended): String {
  e.f()
  e.g()
  return e.u()
}

fun main() {
  test(Extend()) eq "Extend.f() Extend.g()"
}
