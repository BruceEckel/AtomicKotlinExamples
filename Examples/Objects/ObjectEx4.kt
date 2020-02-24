// Objects/ObjectEx4.kt
package objectex4
import atomictest.*

private val trace = Trace()

interface AdventureGame {
  interface Environment
  interface Character
  val environment: Environment
  val characters: MutableList<Character>
  fun characterGenerator(): Character
  fun populate(size: Int) = repeat(size) {
    characters.add(characterGenerator())
  }
}

class Jungle : AdventureGame.Environment {
  companion object {
    fun create() {}
  }
}

class Monkey : AdventureGame.Character {
  companion object {
    fun create() {}
  }
}

class Snake : AdventureGame.Character {
  companion object {
    fun create() {}
  }
}

class MonkeysVsSnakes() : AdventureGame {
  override val environment = Jungle()
  override val characters =
    mutableListOf<AdventureGame.Character>()
  override fun characterGenerator() = Monkey()
}

fun main() {
  trace eq """

  """
}
