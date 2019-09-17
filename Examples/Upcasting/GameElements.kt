// Upcasting/GameElements.kt
package upcasting

interface GameElement {
  fun playTurn()
}

abstract class StaticElement : GameElement {
  override fun playTurn() {
    println("Static element does nothing")
  }
}

class Wall : StaticElement()

class Bomb : StaticElement() {
  override fun playTurn() {
    println("Bomb blows up some elements")
  }
}

enum class Move {
  UP, RIGHT, DOWN, LEFT
}

abstract class MobileElement : GameElement {
  abstract fun makeMove(move: Move)
}

class Robot: MobileElement() {
  override fun playTurn() {
    println("Robot eats some food")
  }
  override fun makeMove(move: Move) {
    println("Robot goes $move")
  }
  fun score(): String {
    return "the amount of eaten food"
  }
}
