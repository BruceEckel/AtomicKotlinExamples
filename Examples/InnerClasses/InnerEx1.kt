// InnerClasses/InnerEx1.kt
package innerclassesex1
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
  fun hamster(): Pet {
    val poke = "Squeak"
    return object : Pet {
      override fun speak() = poke + home()
    }
  }
}

fun main() {
  val create = PetCreator()
  create.dog().speak() eq "Bark home!"
  create.cat().speak() eq "Meow home!"
  create.hamster().speak() eq "Squeak home!"
}
