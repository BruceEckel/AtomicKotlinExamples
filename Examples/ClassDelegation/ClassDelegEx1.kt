// ClassDelegation/ClassDelegEx1.kt
package classdelegationex1
import atomictest.eq

interface Rectangle {
  fun paint(): Int
  fun resize(scale: Int): Int
}

class ButtonImage(
  val width: Int,
  val height: Int
) : Rectangle {
  override fun paint() = width * height
  override fun resize(scale: Int) = scale
}

interface MouseManager {
  fun clicked(): Boolean
  fun hovering(): Boolean
  fun rightClicked(): Boolean
}

class UserInput : MouseManager {
  override fun clicked() = true
  override fun hovering() = true
  override fun rightClicked() = true
}

class Button(
  val width: Int,
  val height: Int,
  val image: Rectangle =
    ButtonImage(width, height),
  val input: MouseManager = UserInput()
) : Rectangle by image, MouseManager by input

fun main() {
  val button = Button(10, 5)
  button.paint() eq 50
  button.clicked() eq true
  button.hovering() eq true
  button.resize(10) eq 10
  button.rightClicked() eq true
}
