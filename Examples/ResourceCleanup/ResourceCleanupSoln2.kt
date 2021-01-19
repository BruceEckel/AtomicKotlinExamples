// ResourceCleanup/ResourceCleanupSoln2.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package resourceCleanupExercise2
import atomictest.trace

class Cleanup : AutoCloseable {
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
  trace eq "f() g() h() close()"
}
