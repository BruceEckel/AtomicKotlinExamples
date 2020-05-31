// WithFunction/WithCleanup.kt
package withfunction
import atomictest.*

private var trace = Trace()

class Cleanup(n: Int): AutoCloseable {
  val id = n
  val x = trace("Create $id")
  fun show() { trace("show() $id")}
  override fun close() = trace("Close $id")
}

fun main() {
  with(Cleanup(1)) { show() }
  trace("-----")
  Cleanup(2).use { it.show() }
  trace eq """
  Create 1
  show() 1
  -----
  Create 2
  show() 2
  Close 2
  """
}
