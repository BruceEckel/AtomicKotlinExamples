// Interfaces/PlayerInterface.kt
package propertiesininterfaces
import atomictest.eq

interface Player {
  val symbol: Char
}

class Food: Player {
  override val symbol = '.'
}

class Robot: Player {
  override val symbol get() = 'R'
}

class Wall(override val symbol: Char): Player

fun main() {
  listOf(Food(), Robot(), Wall('|')).map {
    it.symbol
  } eq "[., R, |]"
}
