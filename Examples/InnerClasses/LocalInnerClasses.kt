// InnerClasses/LocalInnerClasses.kt
package innerclasses
import atomictest.eq

interface Pet {
  fun speak(): String
}

fun createDog(): Pet {
  val say = "Bark"
  // Local inner class:
  class Dog : Pet {
    override fun speak() = say
  }
  return Dog()
}

fun createCat(): Pet {
  val emit = "Meow"
  // Anonymous inner class:
  return object : Pet {
    override fun speak() = emit
  }
}

fun main() {
  createDog().speak() eq "Bark"
  createCat().speak() eq "Meow"
}
