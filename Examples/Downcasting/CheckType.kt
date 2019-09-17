// Downcasting/CheckType.kt
package downcasting
import atomictest.eq

fun main() {
  val group = listOf(Human(), Human(),
    Dog(), Alien()) 
  val dog = group
    .find { it is Dog } as Dog?      // [1]
  dog?.bark() eq "Yip!"              // [2]
}
