// Interfaces/InterfaceIndependence.kt
package game

interface Position

interface Maze {

  fun getAll(): Set<GameElement>

  fun getAllAt(
    position: Position): Set<GameElement>

  fun getPosition(
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
