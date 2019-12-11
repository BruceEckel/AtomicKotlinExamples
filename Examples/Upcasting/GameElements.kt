// Upcasting/GameElements.kt
package upcasting

interface GameElement {
  fun play()
}

abstract class StaticElement : GameElement {
  override fun play() {
    println("Static element does nothing")
  }
}

class Wall : StaticElement()

class Bomb : StaticElement() {
  override fun play() {
    println("Bomb blows up some elements")
  }
}

enum class Move {
  UP, RIGHT, DOWN, LEFT
}

abstract class MobileElement : GameElement {
  abstract fun move(move: Move)
}

class Robot : MobileElement() {
  override fun play() {
    println("Robot eats some food")
  }

  override fun move(move: Move) {
    println("Robot goes $move")
  }

  fun score(): String {
    return "the amount of eaten food"
  }
}
