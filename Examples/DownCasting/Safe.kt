// DownCasting/Safe.kt
// ©2020 Mindview LLC. See Copyright.txt for permissions.
package downcasting
import atomictest.eq

fun dogBarkSafe(c: Creature) =
  (c as? Dog)?.bark() ?: "Not a Dog"

fun main() {
  dogBarkSafe(Dog()) eq "Yip!"
  dogBarkSafe(Human()) eq "Not a Dog"
}
