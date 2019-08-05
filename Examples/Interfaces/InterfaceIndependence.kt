// Interfaces/InterfaceIndependence.kt
package game

interface Position

interface Maze {
  fun all(): Set<GameElement>

  fun allAt(
    position: Position): Set<GameElement>

  fun position(
    element: GameElement): Position?

  fun add(
    element: GameElement,
    position: Position)

  fun remove(element: GameElement)
}

interface GameElement {
  fun playTurn(maze: Maze)
}
