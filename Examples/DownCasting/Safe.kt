// DownCasting/Safe.kt
package downcasting
import atomictest.eq

fun dogBarkSafe(smb: LivingBeing) =
  (smb as? Dog)?.bark() ?: "Not a Dog"

fun main() {
  dogBarkSafe(Dog()) eq "Yip!"
  dogBarkSafe(Human()) eq "Not a Dog"
}
