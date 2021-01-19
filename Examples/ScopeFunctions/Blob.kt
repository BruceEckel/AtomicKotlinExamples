// ScopeFunctions/Blob.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package scopefunctions
import atomictest.*

data class Blob(val id: Int) : AutoCloseable {
  override fun toString() = "Blob($id)"
  fun show() { trace("$this")}
  override fun close() = trace("Close $this")
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
    Blob(1)
    Blob(2)
    Blob(3)
    Blob(4)
    Blob(5)
    Blob(6)
    Close Blob(6)
    Blob(7)
    Close Blob(7)
    Blob(8)
    Close Blob(8)
    Blob(9)
    Close Blob(9)
    Blob(10)
    Close Blob(10)
  """
}
