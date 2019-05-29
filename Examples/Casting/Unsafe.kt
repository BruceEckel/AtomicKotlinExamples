// Casting/Unsafe.kt
package casting
import atomictest.eq
import atomictest.capture

fun dogBarkUnsafe(a: Any) = (a as Dog).bark()

fun main() {
  dogBarkUnsafe(Dog()) eq "yip!"
  (capture {
    dogBarkUnsafe(42)
  }).startsWith("ClassCastException")
}
