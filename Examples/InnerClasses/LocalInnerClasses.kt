// InnerClasses/LocalInnerClasses.kt
package innerclasses
import atomictest.eq

fun interface Pet {
  fun speak(): String
}

class PetCreator {
  fun home() = " home!"
  fun dog(): Pet {
    val say = "Bark"
    // Local inner class:
    class Dog: Pet {
      override fun speak() = say + home()
    }
    return Dog()
  }
  fun cat(): Pet {
    val emit = "Meow"
    // Anonymous inner class:
    return object: Pet {
      override fun speak() = emit + home()
    }
  }
  fun hamster(): Pet {
    val squeak = "Squeak"
    // SAM conversion:
    return Pet { squeak + home() }
  }
}

fun main() {
  val create = PetCreator()
  create.dog().speak() eq "Bark home!"
  create.cat().speak() eq "Meow home!"
  create.hamster().speak() eq "Squeak home!"
}
