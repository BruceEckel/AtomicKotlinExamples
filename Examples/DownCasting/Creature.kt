// Downcasting/Creature.kt
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
  var c: Creature = Human()
  what(c) eq "I'm Human"
  c = Dog()
  what(c) eq "Yip!"
  c = Alien()
  what(c) eq "Three legs"
  class Who: Creature
  what(Who()) eq "Something else"
}
