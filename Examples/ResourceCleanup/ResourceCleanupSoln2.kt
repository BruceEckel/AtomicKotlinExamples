// ResourceCleanup/ResourceCleanupSoln2.kt
package resourcecleanupsoln2
import java.io.Closeable

class Cleanup : Closeable {
  fun f() = println("f()")
  fun g() = println("g()")
  fun h() = println("h()")
  override fun close() = println("close()")
}

fun main() {
  Cleanup().use {
    it.f()
    it.g()
    it.h()
  }
}
/* Output:
f()
g()
h()
close()
 */
