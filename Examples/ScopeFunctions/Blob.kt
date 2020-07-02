// ScopeFunctions/Blob.kt
package scopefunctions
import atomictest.*

data class Blob(val id: Int): AutoCloseable {
  init { trace("Create $id") }
  fun show() { trace("Show $id")}
  override fun close() = trace("Close $id")
}

fun main() {
  Blob(1).let { it.show() }
  Blob(2).run { show() }
  with(Blob(3)) { show() }
  Blob(4).apply { show() }
  Blob(5).also { it.show() }
  Blob(6).use { it.show() }
  Blob(7).use {
    it.run { show() }
  }
  trace eq """
    Create 1
    Show 1
    Create 2
    Show 2
    Create 3
    Show 3
    Create 4
    Show 4
    Create 5
    Show 5
    Create 6
    Show 6
    Close 6
    Create 7
    Show 7
    Close 7
  """
}
