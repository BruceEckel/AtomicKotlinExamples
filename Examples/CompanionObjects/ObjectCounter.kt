// CompanionObjects/ObjectCounter.kt
import atomictest.eq

class Numbered {
  companion object {
    private var count = 0
  }
  private val id = count++
  override fun toString() = "#$id"
}

fun main() {
  listOf(Numbered(), Numbered(),
    Numbered(), Numbered(), Numbered()) eq
    "[#0, #1, #2, #3, #4]"
}
