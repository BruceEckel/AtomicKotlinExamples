// Casting/SmartCast.kt
package downcasting
import atomictest.eq

class Dog : LivingBeing {
  fun bark() = "Yip!"
}

fun dogBark(smb: LivingBeing) =
  if (smb is Dog) smb.bark() else "Not Dog"

fun main() {
  dogBark(Dog()) eq "Yip!"
  dogBark(Alien()) eq "Not Dog"
}
