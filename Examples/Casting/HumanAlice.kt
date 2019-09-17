// Casting/HumanAlice.kt
package downcasting
import atomictest.eq

interface LivingBeing

class Human : LivingBeing {
  fun greeting() = "I'm Human."
}

class Alien : LivingBeing

fun main() {
  val smb: LivingBeing = Human()  // [1]
  if (smb is Human) {
    // Code in this block assumes
    // smb is an Human object
    smb.greeting() eq "I'm Human." // [2]
  }
  if (smb is Alien) {             // [3]
    // code here won't be called
    // when smb is Human
  }
}
