// LateInitialization/FaultySuitcase.kt
package lateinitialization
import atomictest.*

class FaultySuitcase: Bag {
  lateinit var items: String
  override fun setUp() { }
  fun checkSocks(): Boolean =
    items.contains("socks")
}

fun main() {
  val suitcase = FaultySuitcase()
  suitcase.setUp()
  capture {
    suitcase.checkSocks()
  } eq
    "UninitializedPropertyAccessException" +
    ": lateinit property items " +
    "has not been initialized"
}
