// ExceptionHandling/WithCleanup.kt
package withfunction

class Cleanup(n: Int): AutoCloseable {
  val id = n
  val x = println("Create $id")
  fun show() { println("Use $id")}
  override fun close() = println("Close $id")
}

fun main() {
  with(Cleanup(1)) { show() }
  Cleanup(2).use { it.show() }
}
/* Output:
Create 1
Use 1
Create 2
Use 2
Close 2
*/
