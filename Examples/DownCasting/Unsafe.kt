// DownCasting/Unsafe.kt
package downcasting
import atomictest.*

fun dogBarkUnsafe(c: Creature) =
  (c as Dog).bark()

fun main() {
  dogBarkUnsafe(Dog()) eq "Yip!"
  (capture {
    dogBarkUnsafe(Human())
  }).startsWith("ClassCastException")
}
