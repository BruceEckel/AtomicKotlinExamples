// Downcasting/FilterIsInstance.kt
package downcasting
import atomictest.eq

fun main() {
  val humans1 =
    group.filter { it is Human }
  humans1.size eq 2
  val humans2 =
    group.filterIsInstance<Human>()
  humans2 eq humans1
}
