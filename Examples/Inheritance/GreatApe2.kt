// Inheritance/GreatApe2.kt
import atomictest.eq

open class GreatApe {
  protected var energy = 0
  open fun call() = "Hoo!"
  open fun eat() { energy += 10 }
  fun climb(x: Int) { energy -= x }
  fun energyLevel() = "Energy: $energy"
}

class Bonobo : GreatApe() {
  override fun call() = "Eep!"
  override fun eat() {
    // Modify the base-class var:
    energy += 10
    // Call the base-class version:
    super.eat()
  }
  // Add a function:
  fun run() = "Bonobo run"
}

class Chimpanzee : GreatApe() {
  // New property
  val additionalEnergy = 20
  override fun call() = "Yawp!"
  override fun eat() {
    energy += additionalEnergy
    super.eat()
  }
  // Add a function:
  fun jump() = "Chimp jump"
}

fun talk(ape: GreatApe): String {
  // ape.run()  // Not an ape function
  // ape.jump() // Nor this
  ape.eat()
  ape.climb(10)
  return "${ape.call()} ${ape.energyLevel()}"
}

fun main(args: Array<String>) {
  // Cannot access 'energy':
  // GreatApe().energy
  talk(GreatApe()) eq "Hoo! Energy: 0"
  talk(Bonobo()) eq "Eep! Energy: 10"
  talk(Chimpanzee()) eq "Yawp! Energy: 20"
}
