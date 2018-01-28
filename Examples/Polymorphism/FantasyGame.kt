// Polymorphism/FantasyGame.kt
package polymorphism
import atomictest.eq

abstract class Name {
  override fun toString() =
    javaClass.simpleName
}

open class Element : Name() {
  fun interact(other: Element) =
    "$this interacts with $other"
}

open class Inert : Element()
open class Wall : Inert()

interface Material {
  fun resilience(): String
}

interface Wood : Material {
  override fun resilience() = "Breakable"
}

interface Rock : Material {
  override fun resilience() = "Hard"
}

class RockWall() : Wall(), Rock
class WoodWall : Wall(), Wood

interface Skill

interface Fighting : Skill {
  fun fight() = "Fights"
}

interface Digging : Skill {
  fun dig() = "Digs"
}

interface Magic : Skill {
  fun castSpell() = "Casts"
}

interface Flight : Skill {
  fun fly() = "Flies"
}

open class
Character(var player: String = "None") :
  Element()

class Fairy : Character(), Magic

class Viking : Character(), Fighting

class Dwarf : Character(), Digging, Fighting

class Wizard : Character(), Magic
class Dragon : Character(), Magic, Flight

fun contact(e1: Element, e2: Element) =
  "${e1.interact(e2)}"

fun battle(fighter: Fighting) =
  "$fighter ${fighter.fight()}"

fun <F> fly(flyer: F, opponent: Element)
  where F : Element, F : Flight =
  "$flyer ${flyer.fly()}, " +
    "${contact(opponent, flyer)}"

fun main(args: Array<String>) {
  val d = Dragon()
  d.player = "Puff"
  d.interact(RockWall()) eq
    "Dragon interacts with RockWall"
  battle(Viking()) eq "Viking Fights"
  battle(Dwarf()) eq "Dwarf Fights"
  fly(d, Fairy()) eq
    "Dragon Flies, " +
    "Fairy interacts with Dragon"
  contact(Viking(), Fairy()) eq
    "Viking interacts with Fairy"
}
