// ResourceCleanup/Usable.kt
package resourcecleanup
import atomictest.*

private val trace = Trace()

class Usable() : AutoCloseable {
  fun func() = trace("func()")
  override fun close() = trace("close()")
}

fun main() {
  Usable().use { it.func() }
  trace eq """
  func()
  close()
  """
}
