// ScopeFunctions/Blob.kt
package scopefunctions
import atomictest.*

data class Blob(val id: Int): AutoCloseable {
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
  Blob(7).use { it.run { show() } }
  Blob(8).apply { show() }.also { it.close() }
  Blob(9).also { it.show() }.apply { close() }
  Blob(10).apply { show() }.use {  }
  trace eq """
    Show 1
    Show 2
    Show 3
    Show 4
    Show 5
    Show 6
    Close 6
    Show 7
    Close 7
    Show 8
    Close 8
    Show 9
    Close 9
    Show 10
    Close 10
  """
}