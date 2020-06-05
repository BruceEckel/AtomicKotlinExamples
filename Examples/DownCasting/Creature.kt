// DownCasting/Creature.kt
package downcasting
import atomictest.eq

interface Creature

class Human : Creature {
  fun greeting() = "I'm Human"
}

class Dog : Creature {
  fun bark() = "Yip!"
}

class Alien : Creature {
  fun mobility() = "Three legs"
}

fun what(c: Creature): String =
  when (c) {
    is Human -> c.greeting()
    is Dog -> c.bark()
    is Alien -> c.mobility()
    else -> "Something else"
  }

fun main() {
  val c: Creature = Human()
  what(c) eq "I'm Human"
  what(Dog()) eq "Yip!"
  what(Alien()) eq "Three legs"
  class Who: Creature
  what(Who()) eq "Something else"
}
