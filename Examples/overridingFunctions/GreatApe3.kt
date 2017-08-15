// overridingFunctions/GreatApe3.kt
import atomicTest.eq

open class GreatApe {

  protected var energy = 0

  open fun call() = "Hoo!"

  open fun eat(): Int {
    energy += 10
    return energy
  }

  fun climb(x: Int) {
    energy -= x
  }
}

class Bonobo : GreatApe() {

  override fun call() = "Eep!"

  override fun eat(): Int {
    // Modify the base-class var:
    energy += 10
    // Call the base-class version:
    return super.eat()
  }

  // Add a function():
  fun run() = "Bonobo run"
}

class Chimpanzee : GreatApe() {
  val additionalEnergy = 20 // New property

  override fun call() = "Yawp!"

  override fun eat(): Int {
    energy += additionalEnergy
    return super.eat()
  }

  fun jump() = "Chimp jump"
}

fun talk(ape: GreatApe): String {
  // ape.run()  // Not an ape function
  // ape.jump // Nor this
  ape.climb(10)
  return ape.call() + ape.eat()
}

fun main(args: Array<String>) {
  talk(GreatApe()) eq "Hoo!0"
  talk(Bonobo()) eq "Eep!10"
  talk(Chimpanzee()) eq "Yawp!20"
}
