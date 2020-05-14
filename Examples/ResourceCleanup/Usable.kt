// ResourceCleanup/Usable.kt
package resourcecleanup
import java.io.Closeable
import atomictest.*

private val trace = Trace()

class Usable() : Closeable {
  fun operation() = trace("Usable.operation")
  override fun close() = trace("Usable.close")
}

fun main() {
  Usable().use { it.operation() }
  trace eq """
  Usable.operation
  Usable.close
  """
}
