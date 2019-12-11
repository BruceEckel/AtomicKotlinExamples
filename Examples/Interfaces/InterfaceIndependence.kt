// Interfaces/InterfaceIndependence.kt
package game

interface Cell

interface Maze {
  fun all(): Set<GameElement>
  fun allIn(c: Cell): Set<GameElement>
  fun cell(e: GameElement): Cell?
  fun add(e: GameElement, c: Cell)
  fun remove(e: GameElement)
}

interface GameElement {
  fun play(maze: Maze)
}
