// Upcasting/UpcastExercise3.kt
package upcasting
import atomictest.*

private val trace = Trace()

interface Fight {
  fun fight()
}

interface Swim {
  fun swim()
}

interface Fly {
  fun fly()
}

open class ActionCharacter {
  fun fight() =
    trace("ActionCharacter fight")
}

class Hero :
  ActionCharacter(), Fight, Swim, Fly {
  override fun swim() = trace("Hero swim")
  override fun fly() = trace("Hero fly")
}

fun t(x: Fight) = x.fight()
fun u(x: Swim) = x.swim()
fun v(x: Fly) = x.fly()
fun w(x: ActionCharacter) = x.fight()

fun main() {
  val h = Hero()
  t(h) // Treat it as a Fight
  u(h) // Treat it as a Swim
  v(h) // Treat it as a Fly
  w(h) // Treat it as an ActionCharacter
  trace eq """
    ActionCharacter fight
    Hero swim
    Hero fly
    ActionCharacter fight
  """
}
