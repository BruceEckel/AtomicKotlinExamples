// LazyInitialization/LazyInt.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package lazyinitialization
import atomictest.*

class LazyInt(val init: () -> Int) {
  private var helper: Int? = null
  val value: Int
    get() {
      if (helper == null)
        helper = init()
      return helper!!
    }
}

fun main() {
  val later = LazyInt {
    trace("Initializing 'later'")
    5
  }
  trace("First 'value' access:")
  trace(later.value)
  trace("Second 'value' access:")
  trace(later.value)
  trace eq """
    First 'value' access:
    Initializing 'later'
    5
    Second 'value' access:
    5
  """
}
