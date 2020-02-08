// DownCasting/Unsafe.kt
package downcasting
import atomictest.eq
import atomictest.capture

fun dogBarkUnsafe(c: Creature) =
  (c as Dog).bark()

fun main() {
  dogBarkUnsafe(Dog()) eq "Yip!"
  (capture {
    dogBarkUnsafe(Human())
  }).startsWith("ClassCastException")
}
