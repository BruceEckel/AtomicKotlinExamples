// Upcasting/Task3.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package upcastingExercise3
import atomictest.trace

interface Fighter {
  fun fight(): String
}

interface Swimmer {
  fun swim(): String
}

interface Flyer {
  fun fly(): String
}

open class ActionCharacter {
  fun fight(): String = "ActionCharacter fight"
}

class Hero : ActionCharacter(), Fighter, Swimmer, Flyer {
  override fun swim() = "Hero swim"
  override fun fly() = "Hero fly"
}

fun tryFight(x: Fighter) {
  trace(x.fight())
}

fun trySwim(x: Swimmer) {
  trace(x.swim())
}

fun tryFly(x: Flyer) {
  trace(x.fly())
}

fun doAction(x: ActionCharacter) {
  trace(x.fight())
}

fun main() {
  val h = Hero()
  tryFight(h) // Treat it as a Fight
  trySwim(h) // Treat it as a Swim
  tryFly(h) // Treat it as a Fly
  doAction(h) // Treat it as an ActionCharacter
  trace eq """
    ActionCharacter fight
    Hero swim
    Hero fly
    ActionCharacter fight
  """
}
