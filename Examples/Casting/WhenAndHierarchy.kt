// Casting/WhenAndHierarchy.kt
package downcasting
import atomictest.eq

fun react(smb: LivingBeing) =
  when (smb) {
    is Human ->
      smb.greeting() + " It's only human..."
    is Dog -> smb.bark() + " Hi, dog!"
    is Alien -> "Alien!!!"
    else -> "Unknown living being"
  }

fun main() {
  react(Human()) eq
    "I'm Human. It's only human..."
  react(Dog()) eq "Yip! Hi, dog!"
  react(Alien()) eq "Alien!!!"
}
