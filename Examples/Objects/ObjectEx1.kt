// Objects/ObjectEx1.kt
package objectex1
import atomictest.*

private val trace = Trace()

private fun f() = trace("f() $p")
private val p = "p"

object Space {
  fun f() = trace("Space.f() $p")
  private val p = "Space.p"
}

private object Space2 {
  fun f() = trace("Space2.f() $p")
  private val p = "Space2.p"
}

fun main() {
  f()
  Space.f()
  Space2.f()
  trace eq """
  f() p
  Space.f() Space.p
  Space2.f() Space2.p
  """
}
