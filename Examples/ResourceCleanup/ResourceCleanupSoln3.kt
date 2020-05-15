// ResourceCleanup/ResourceCleanupSoln3.kt
package resourcecleanupsoln3
import java.io.Closeable
import atomictest.*

private val trace = Trace()

class Cleanup : Closeable {
  fun f() = trace("f()")
  fun g() = trace("g()")
  override fun close() = trace("close()")
}

fun test(
  _return: Boolean = false,
  _throw: Boolean = false
) {
  Cleanup().use {
    it.f()
    if(_return) return
    if(_throw) throw Exception()
    it.g()
  }
}

fun main() {
  test()
  test(_return = true)
  capture {
    test(_throw = true)
  } eq "Exception"
  trace eq """
  f()
  g()
  close()
  f()
  close()
  f()
  close()
  """
}
