// Objects/ObjectEx3.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package objectsExercise3
import atomictest.*

interface AdventureGame {
  interface Environment
  interface Character
  val environment: Environment
  val characters: MutableList<Character>
  fun populate()
}

class Jungle : AdventureGame.Environment {
  object Factory {
    fun create() = Jungle()
  }
}

class Monkey : AdventureGame.Character {
  object Factory {
    fun create() = Monkey()
  }
  override fun toString() = "Monkey"
}

class Snake : AdventureGame.Character {
  object Factory {
    fun create() = Snake()
  }
  override fun toString() = "Snake"
}

object MonkeysVsSnakes : AdventureGame {
  override val environment =
    Jungle.Factory.create()
  override val characters =
    mutableListOf<AdventureGame.Character>()
  override fun populate() {
    characters.add(Monkey.Factory.create())
    characters.add(Snake.Factory.create())
  }
}

fun main() {
  MonkeysVsSnakes.populate()
  MonkeysVsSnakes.characters eq
    "[Monkey, Snake]"
}
