// Casting/Safe.kt
package casting
import atomictest.eq

fun dogBarkSafe(a: Any) =
  (a as? Dog)?.bark() ?: "Not a Dog"

fun main() {
  dogBarkSafe(Dog()) eq "yip!"
  dogBarkSafe(42) eq "Not a Dog"
}
