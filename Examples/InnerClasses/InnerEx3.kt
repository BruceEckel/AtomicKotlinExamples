// InnerClasses/InnerEx3.kt
package innerclassesex3
import atomictest.eq

interface Pet {
  fun speak(): String
}

class PetCreator {
  fun home() = " home!"
  fun dog(): Pet {
    val say = "Bark"
    class Dog : Pet {
      override fun speak() = say + home()
    }
    return Dog()
  }
  fun cat(): Pet {
    val emit = "Meow"
    return object : Pet {
      override fun speak() = emit + home()
    }
  }
}

fun main() {
  val create = PetCreator()
  create.dog().speak() eq
    "Bark home!"
  create.cat().speak() eq
    "Meow home!"
}
