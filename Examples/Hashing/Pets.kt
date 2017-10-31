// Hashing/Pets.kt
package hashing
import atomictest.eq

interface Pet {
  companion object {
    var n = 0
    fun next() = n++
  }
}

data class Cat(val name:String,
  val id: Int = Pet.next()): Pet
data class Dog(val name:String,
  val id: Int = Pet.next()): Pet
data class Rat(val name:String,
  val id: Int = Pet.next()): Pet

fun main(args: Array<String>) {
  val pets = HashSet(setOf(
    Cat("Elsie"),
    Dog("Rufus"),
    Rat("Fizzy"),
    Cat("Stanford"),
    Rat("Freckly"),
    Rat("Fuzzy")))
  pets.joinToString(separator = "\n") eq
    """
    Cat(name=Stanford, id=3)
    Rat(name=Freckly, id=4)
    Rat(name=Fuzzy, id=5)
    Rat(name=Fizzy, id=2)
    Cat(name=Elsie, id=0)
    Dog(name=Rufus, id=1)
    """.trimIndent()

  (pets.first() in pets) eq true
  (Dog("Pugsly") in pets) eq false
  // Because each object has a unique id:
  (Dog("Rufus") in pets) eq false
}
