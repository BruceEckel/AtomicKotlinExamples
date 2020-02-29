// CompanionObjects/CompanionObject.kt
import atomictest.eq

class WithCompanion {
  companion object {
    val i = 3
    fun f() = i * 3
  }
  fun g() = i + f()
}

fun main() {
  WithCompanion.i eq 3
  WithCompanion.f() eq 9
  val wc = WithCompanion()
  wc.g() eq 12
}
