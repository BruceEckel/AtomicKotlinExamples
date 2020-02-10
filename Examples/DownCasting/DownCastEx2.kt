// DownCasting/DownCastEx2.kt
package downcasting
import atomictest.eq

fun main() {
  group.filterIsInstance<Dog>()
    .map(Dog::bark) eq "[Yip!, Yip!]"
  group.filterIsInstance(Dog::class.java)
    .map(Dog::bark) eq "[Yip!, Yip!]"
}
