// ErrorReporting/Usable.kt
import java.io.Closeable

class Usable(val msg: String) : Closeable {
  fun operation() =
    println("Usable.operation $msg")

  override fun close() =
    println("closing Usable $msg")
}

fun main() {
  Usable("Done").use { it.operation() }
}
/* Output:
Usable.operation Done
closing Usable Done
*/
