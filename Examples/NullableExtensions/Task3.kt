// NullableExtensions/Task3.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package extensionsForNullableTypesExercise3
import atomictest.eq

data class Container(val contents: Any?)

fun Container?.empty() = this == null || contents == null

fun Container?.full() = !empty()

fun main() {
  val container = Container(42)
  container.empty() eq false
  container.full() eq true

  val emptyContainer = Container(null)
  emptyContainer.empty() eq true
  emptyContainer.full() eq false
}
