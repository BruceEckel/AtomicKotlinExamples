// DownCasting/DownCastEx2.kt
package downcasting
import atomictest.eq

fun main() {
  group.filterIsInstance<Dog>()
    .map(Dog::bark) eq "[Yip!, Yip!]"
  val dogClass = Dog().javaClass
  group.filterIsInstance(dogClass)
    .map(Dog::bark) eq "[Yip!, Yip!]"
}
