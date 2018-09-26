// CompanionObjects/CompanionObject.kt
import atomictest.eq

class WithCompanion {
  companion object {
    val i = 3
    fun f() = i * 3
  }
}

fun main() {
  WithCompanion.i eq 3
  WithCompanion.f() eq 9
  // The default name is "Companion":
  WithCompanion.Companion.i eq 3
  WithCompanion.Companion.f() eq 9
}
