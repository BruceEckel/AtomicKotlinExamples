// ResourceCleanup/ResourceCleanupSoln2.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package resourcecleanupsoln2

class Cleanup: AutoCloseable {
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
