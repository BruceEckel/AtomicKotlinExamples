// ScopeFunctions/ApplyIfNotNull.kt
package scopefunctions
import atomictest.*

data class Plumbus(var id: Int)

fun display(map: Map<String, Plumbus>) {
  val plumbus =
    map["main"]?.apply {
      id += 10
    } ?: return                 // [1]
  // ...
  show(plumbus)
}

fun show(plumbus: Plumbus) {}

fun main() {
  display(mapOf("main" to Plumbus(1)))
  display(mapOf("none" to Plumbus(2)))
}
