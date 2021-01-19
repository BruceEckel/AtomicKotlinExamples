// Polymorphism/Task1.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package polymorphismExercise1
import atomictest.*

abstract class Character(val name: String) {
  abstract fun play(): String
}

interface Fighter {
  fun fight() = "Fight!"
}

interface Magician {
  fun doMagic() = "Magic!"
}

interface Flyer {
  fun fly() = "Fly!"
}

class Warrior :
  Character("Warrior"), Fighter {
  override fun play() = fight()
}

open class Elf(name: String = "Elf") :
  Character(name), Magician {
  override fun play() = doMagic()
}

class FightingElf :
  Elf("FightingElf"), Fighter {
  override fun play() =
    super.play() + fight()
}

class Dragon:
  Character("Dragon"), Flyer {
  override fun play() = fly()
}

class Wizard:
  Character("Magician"), Magician, Flyer {
  override fun play() = doMagic() + fly()
}

fun Character.playTurn() = name + ": " + play()

fun main() {
  listOf(
    Warrior(),
    Elf(),
    FightingElf(),
    Dragon(),
    Wizard()
  ).map { it.playTurn() } eq
    "[Warrior: Fight!, Elf: Magic!, " +
    "FightingElf: Magic!Fight!, " +
    "Dragon: Fly!, Magician: Magic!Fly!]"
}
