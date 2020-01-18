// Polymorphism/FantasyGame.scala
package polymorphism
import atomictest.eq

open class Element(val id: String) {
  override fun toString() = "$id"
  fun interact(other: Element) =
    "$this interact $other"
}

class Wall : Element("Wall")

interface Skill

interface Fighting : Skill {
  fun fight() = "Fight!"
}

interface Digging : Skill {
  fun dig() = "Dig!"
}

interface Magic : Skill {
  fun castSpell() = "Spell!"
}

interface Flight : Skill {
  fun fly() = "Fly!"
}

open class Character(
  id: String = "Character"
) : Element(id)

open class Fairy : Character("Fairy"), Magic

class FightingFairy : Fairy(), Fighting

class Warrior : Character("Warrior"), Fighting

class Dwarf : Character("Dwarf"), Digging, Fighting

open class Flyer(id: String) : Character(id), Flight

class Dragon(id: String) : Flyer(id), Magic

fun main() {
  val dragon = Dragon("Puff")
  dragon.interact(Wall()) eq "Puff interact Wall"

  fun battle(fighter: Fighting) =
    "$fighter, ${fighter.fight()}"
  battle(Warrior()) eq "Warrior, Fight!"
  battle(Dwarf()) eq "Dwarf, Fight!"
  battle(FightingFairy()) eq "Fairy, Fight!"

  fun fly(flyer: Flyer, opponent: Element) =
    "$flyer, ${flyer.fly()}, " +
      "${opponent.interact(flyer)}"

  fly(dragon, Fairy()) eq
    "Puff, Fly!, Fairy interact Puff"
}