// ErrorReporting/Usable.kt
import java.io.Closeable
import atomictest.*

class Usable(val msg: String): Closeable {
  fun operation() =
    trace("Usable.operation $msg")
  override fun close() =
    trace("closing Usable $msg")
}

fun main(args: Array<String>) {
  Usable("Done").use { it.operation() }
  trace eq
"""
Usable.operation Done
closing Usable Done
"""
}
