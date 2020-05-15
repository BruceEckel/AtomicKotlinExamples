// ResourceCleanup/ResourceCleanupSoln2.kt
package resourcecleanupsoln2
import java.io.Closeable
import atomictest.*

private val trace = Trace()

class Cleanup : Closeable {
  fun f() = trace("f()")
  fun g() = trace("g()")
  override fun close() = trace("close()")
}

fun main() {
  Cleanup().use {
    it.f()
    it.g()
  }
  trace eq """
  f()
  g()
  close()
  """
}
