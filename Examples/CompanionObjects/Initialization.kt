// CompanionObjects/Initialization.kt
package companionobjects
import atomictest.*

private val trace = Trace()

class CompanionInit {
  companion object {
    init {
      trace("companion constructor")
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
  companion constructor
  After 1
  After 2
  After 3
  """
}
