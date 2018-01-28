// LateInitialization/BetterSuitcase.kt
import atomictest.eq

class BetterSuitcase : Bag {
  lateinit var items: String
  override fun setUp() {
    items = "socks, jacket, laptop"
  }

  fun checkSocks(): Boolean =
    items.contains("socks")
}

fun main(args: Array<String>) {
  val suitcase = BetterSuitcase()
  suitcase.setUp()
  suitcase.checkSocks() eq true
}
