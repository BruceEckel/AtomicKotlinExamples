// CompanionObjects/CompanionObject.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package companionobjects
import atomictest.eq

class WithCompanion {
  companion object {
    val i = 3
    fun f() = i * 3
  }
  fun g() = i + f()
}

fun WithCompanion.Companion.h() = f() * i

fun main() {
  val wc = WithCompanion()
  wc.g() eq 12
  WithCompanion.i eq 3
  WithCompanion.f() eq 9
  WithCompanion.h() eq 27
}
