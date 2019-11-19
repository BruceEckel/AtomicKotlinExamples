// Interfaces/InterfaceIndependence.kt
package game

interface Position

interface Maze {
  fun all(): Set<GameElement>

  fun allAt(p: Position): Set<GameElement>

  fun position(e: GameElement): Position?

  fun add(e: GameElement, p: Position)

  fun remove(e: GameElement)
}

interface GameElement {
  fun playTurn(maze: Maze)
}
