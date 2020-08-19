// DownCasting/Unsafe.kt
// ©2020 Mindview LLC. See Copyright.txt for permissions.
package downcasting
import atomictest.*

fun dogBarkUnsafe(c: Creature) =
  (c as Dog).bark()

fun dogBarkUnsafe2(c: Creature): String {
  c as Dog
  c.bark()
  return c.bark() + c.bark()
}

fun main() {
  dogBarkUnsafe(Dog()) eq "Yip!"
  dogBarkUnsafe2(Dog()) eq "Yip!Yip!"
  (capture {
    dogBarkUnsafe(Human())
  }).startsWith("ClassCastException") eq true
}
