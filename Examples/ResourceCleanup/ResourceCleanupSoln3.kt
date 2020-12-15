// ResourceCleanup/ResourceCleanupSoln3.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package resourceCleanupExercise3
import atomictest.*

class Cleanup : AutoCloseable {
  fun f() = trace("f()")
  fun g() = trace("g()")
  fun h() = trace("h()")
  override fun close() = trace("close()")
}

enum class Option { Normal, Return, Throw }

fun verifyClose(opt: Option) {
  Cleanup().use {
    it.f()
    when(opt) {
      Option.Normal -> it.g()
      Option.Return -> return
      Option.Throw -> throw Exception()
    }
    it.h()
  }
}

fun main() {
  verifyClose(Option.Normal)
  verifyClose(Option.Return)
  capture {
    verifyClose(Option.Throw)
  } eq "Exception"
  trace eq """
    f()
    g()
    h()
    close()
    f()
    close()
    f()
    close()
  """
}
