// Interfaces/GameStructure.kt
package gamestructure

interface Maze
class MazeImpl : Maze

interface GameElement
class Robot : GameElement
class Food : GameElement
class Wall : GameElement
