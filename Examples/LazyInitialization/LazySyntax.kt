// LazyInitialization/LazySyntax.kt
package lazyinitialization
import atomictest.*

private val trace = Trace()

val unused: String by lazy {
  trace("Initializing 'unused'")
  "'unused' initialization value"
}

val used: String by lazy {
  trace("Initializing 'used'")
  "'used' initialization value"
}

fun main() {
  trace(used)
  trace eq """
  Initializing 'used'
  'used' initialization value
  """
}
