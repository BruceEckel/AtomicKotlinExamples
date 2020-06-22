// LazyInitialization/LazySyntax.kt
package lazyinitialization
import atomictest.*

val idle: String by lazy {
  trace("Initializing 'idle'")
  "I'm never used"
}

val helpful: String by lazy {
  trace("Initializing 'helpful'")
  "I'm being used!"
}

fun main() {
  trace(helpful)
  trace eq """
    Initializing 'helpful'
    I'm being used!
  """
}
