// ResourceCleanup/ResourceCleanupSoln2.kt
package resourcecleanupsoln2
import java.io.Closeable
import atomictest.*

private val trace = Trace()

class Cleanup : Closeable {
  fun f() = trace("f()")
  fun g() = trace("g()")
  fun h() = trace("h()")
  override fun close() = trace("close()")
}

fun main() {
  Cleanup().use {
    it.f()
    it.g()
    it.h()
  }
  trace eq """
  f()
  g()
  h()
  close()
  """
}
