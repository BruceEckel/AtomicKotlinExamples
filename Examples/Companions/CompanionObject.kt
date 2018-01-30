// Companions/CompanionObject.kt
import atomictest.eq

class WithCompanion {
  companion object {
    val j = 3
    fun foo() = j * 3
  }
}

fun main(args: Array<String>) {
  WithCompanion.j eq 3
  WithCompanion.foo() eq 9
  // The default name is "Companion":
  WithCompanion.Companion.j eq 3
  WithCompanion.Companion.foo() eq 9
}
