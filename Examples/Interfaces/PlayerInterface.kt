// Interfaces/PlayerInterface.kt
package propertiesininterfaces

interface Player {
  val symbol: Char
}

class Robot : Player {
  override val symbol get() = 'R'
}

class Wall : Player {
  override val symbol get() = '#'
}

class Food : Player {
  override val symbol get() = '.'
}
