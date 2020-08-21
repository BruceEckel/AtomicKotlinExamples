// CompanionObjects/Initialization.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package companionobjects
import atomictest.*

class CompanionInit {
  companion object {
    init {
      trace("Companion Constructor")
    }
  }
}

fun main() {
  trace("Before")
  CompanionInit()
  trace("After 1")
  CompanionInit()
  trace("After 2")
  CompanionInit()
  trace("After 3")
  trace eq """
    Before
    Companion Constructor
    After 1
    After 2
    After 3
  """
}
