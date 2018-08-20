// Interfaces/InterfaceIndependence.kt
package game

interface Position

interface Maze {

  fun all(): Set<GameElement>

  fun allAt(
    position: Position): Set<GameElement>

  fun position(
    element: GameElement): Position

  fun move(
    element: GameElement,
    newPosition: Position)

  fun destroy(element: GameElement)
}

interface GameElement {
  fun interact(
    maze: Maze,
    sameCellElements: Set<GameElement>
  )
}
