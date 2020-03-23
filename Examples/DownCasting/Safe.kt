// Downcasting/Safe.kt
package downcasting
import atomictest.eq

fun dogBarkSafe(c: Creature) =
  (c as? Dog)?.bark() ?: "Not a Dog"

fun main() {
  dogBarkSafe(Dog()) eq "Yip!"
  dogBarkSafe(Human()) eq "Not a Dog"
}
