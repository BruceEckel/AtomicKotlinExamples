// Downcasting/Game.kt
package downcasting

enum class Move {
  UP, RIGHT, DOWN, LEFT, WAIT
}

interface GameElement {
  fun play()
}

interface MobileElement : GameElement {
  fun move(move: Move): Cell
}

data class Cell(val x: Int, val y: Int)

class Robot : MobileElement {
  private var eatenFoodItems = 0
  override fun play() {
    println("Robot eats food")
    eatenFoodItems++
  }

  override fun move(move: Move): Cell {
    println("Robot moves $move")
    return Cell(0, 0)
  }

  fun score(): Int {
    return eatenFoodItems
  }
}

interface Maze {
  fun all(): Set<GameElement>
}

interface MutableMaze : Maze

// Dummy implementation:
class MazeImpl : MutableMaze {
  private val all = setOf(Robot())
  override fun all() = all
}

interface Game {
  val maze: Maze
  fun playTurn()
  fun playMove(move: Move)
  fun score(): Int
  // other members
}

class GameImpl : Game {
  private var turns = 0
  override val maze: MutableMaze = MazeImpl()

  override fun score(): Int {
    val robot = maze.all()
      .find { it is Robot }             // [1]
      ?: return 0                       // [2]
    return (robot as Robot)             // [3]
      .score() * 100 - turns            // [4]
  }

  override fun playTurn() {
    maze.all().forEach { element ->
      element.play()
    }
  }

  override fun playMove(move: Move) {
    turns++
    val mobileElements = maze.all()
      .filterIsInstance<MobileElement>() // [5]
    mobileElements.forEach {
      val cell = it.move(move)           // [6]
      // update element cell
    }
  }
}

fun main() {
  val game = GameImpl()
  game.playMove(Move.RIGHT)
  game.playTurn()
  game.playMove(Move.LEFT)
  game.playTurn()
  // each eaten food item is +100
  // each turn is -1
  // 2 * 100 - 2 = 198
  println(game.score())
}
/* Output:
Robot moves RIGHT
Robot eats food
Robot moves LEFT
Robot eats food
198
*/
