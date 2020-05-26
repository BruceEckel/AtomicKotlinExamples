// ResourceCleanup/ResourceCleanupSoln3.kt
package resourcecleanupsoln3
import java.io.Closeable
import atomictest.*

class Cleanup : Closeable {
  fun f() = println("f()")
  fun g() = println("g()")
  fun h() = println("h()")
  override fun close() = println("close()")
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
}
/* Output:
f()
g()
h()
close()
f()
close()
f()
close()
Exception
 */
