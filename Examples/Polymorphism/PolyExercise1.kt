// Polymorphism/FantasyGame.kt
package polymorphism
import atomictest.eq

interface Character {
  val name: String
  fun type(): String
  fun skills(): String
  fun play() =
    "$name ${type()}: ${skills()}"
}

interface Magician {
  fun skills() = "Magic"
}

interface Fighter {
  fun skills() = "Fighting"
}

interface Forger {
  fun skills() = "Forging"
}

interface Flyer {
  fun skills() = "Flying"
}

open class Fairy(override val name: String) :
  Character, Magician, Flyer {
  override fun type() = "Fairy"
  override fun skills() =
    super<Magician>.skills() + ", " +
    super<Flyer>.skills()
}

class FightingFairy(name: String) :
  Fairy(name), Fighter {
  override fun type() = "FightingFairy"
  override fun skills() =
    super<Fairy>.skills() + ", " +
    super<Fighter>.skills()
}

class Warrior(override val name: String) :
  Character, Fighter {
  override fun type() = "Warrior"
  override fun skills() =
    super<Fighter>.skills()
}

class Dwarf(override val name: String) :
  Character, Forger, Fighter {
  override fun type() = "Dwarf"
  override fun skills() =
    super<Forger>.skills() + ", " +
    super<Fighter>.skills()
}

class Dragon(override val name: String) :
  Character, Magician, Flyer {
  override fun type() = "Dragon"
  override fun skills() =
    super<Magician>.skills() + ", " +
    super<Flyer>.skills()
}

fun interact(c1: Character, c2: Character) =
  "${c1.play()} <--> ${c2.play()}"

fun main() {
  val dragon : Character = Dragon("Puff")
  val dwarf : Character = Dwarf("Bob")
  interact(dragon, dwarf) eq
    "Puff Dragon: Magic, Flying <--> " +
    "Bob Dwarf: Forging, Fighting"
}