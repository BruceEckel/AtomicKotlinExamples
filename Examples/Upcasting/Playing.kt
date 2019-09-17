// Upcasting/Playing.kt
package upcasting

fun play(gameElement: GameElement) {
  println("Playing turn:")
  gameElement.playTurn()
}

fun main() {
  val robot = Robot()
  val wall = Wall() 
  val bomb = Bomb()
  play(robot)
  play(wall)
  play(bomb)
}
/* Output:
Playing turn:
Robot eats some food
Playing turn:
Static element does nothing
Playing turn:
Bomb blows up some elements
*/
