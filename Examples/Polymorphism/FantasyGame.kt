// Polymorphism/FantasyGame.kt
package polymorphism
import atomicTest.eq

abstract class Name {
  override fun toString(): String =
    this.javaClass.simpleName
}

open class Element: Name() {
  fun interact(other: Element) =
    "$this interact $other"
}

open class Inert: Element()
open class Wall: Inert()

interface Material {
  fun resilience(): String
}

interface Wood: Material {
  override fun resilience() = "Breakable"
}

interface Rock: Material {
  override fun resilience() = "Hard"
}

class RockWall(): Wall(), Rock
class WoodWall: Wall(), Wood

interface Skill

interface Fighting: Skill {
  fun fight() = "Fight!"
}

interface Digging: Skill {
  fun dig() = "Dig!"
}

interface Magic: Skill {
  fun castSpell() = "Spell!"
}

interface Flight: Skill {
  fun fly() = "Fly!"
}

open class
Character(var player: String = "None"):
  Element()

class Fairy: Character(), Magic

class Viking: Character(), Fighting

class Dwarf: Character(), Digging, Fighting

class Wizard: Character(), Magic
class Dragon: Character(), Magic, Flight

fun battle(fighter: Fighting) =
  "$fighter, ${fighter.fight()}"

fun <F> fly(flyer: F, opponent: Element) where F: Element, F: Flight =
  "$flyer, ${flyer.fly()}, ${opponent.interact(flyer)}"

fun main(args: Array<String>) {
  val d = Dragon()
  d.player = "Puff"
  d.interact(Wall()) eq
      "Dragon interact Wall"
  battle(Viking()) eq "Viking, Fight!"
  battle(Dwarf()) eq "Dwarf, Fight!"
  fly(d, Fairy()) eq
    "Dragon, Fly!, Fairy interact Dragon"
}
