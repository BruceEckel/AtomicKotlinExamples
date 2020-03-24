// DownCasting/FindType.kt
package downcasting
import atomictest.eq

val group: List<Creature> = listOf(
  Human(), Human(), Dog(), Alien(), Dog()
)

fun main() {
  val dog = group
    .find { it is Dog } as Dog?      // [1]
  dog?.bark() eq "Yip!"              // [2]
}
