// Downcasting/FilterIsInstance.kt
package downcasting
import atomictest.eq

fun main() {
  val group = listOf(Human(), Human(),
    Dog(), Alien())
  val humans1 =
    group.filter { it is Human }     // [1]
  humans1.size eq 2

  val humans2 =
    group.filterIsInstance<Human>()  // [2]
  humans2 eq humans1
}
