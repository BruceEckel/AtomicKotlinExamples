// DownCasting/DownCastEx3.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package downcastingExercise3
import atomictest.*

interface Animal1

class Worm1: Animal1 {
  fun wriggle() = trace("Wriggle")
}

class Snail1: Animal1 {
  fun slide() = trace("Slide")
}

class Beetle1: Animal1 {
  fun walk() = trace("Walk")
}

fun move(a1: Animal1) {
  when(a1) {
    is Worm1 -> a1.wriggle()
    is Snail1 -> a1.slide()
    is Beetle1 -> a1.walk()
  }
}

interface Animal2 {
  fun move()
}

class Worm2: Animal2 {
  override fun move() = trace("Wriggle")
}

class Snail2: Animal2 {
  override fun move() = trace("Slide")
}

class Beetle2: Animal2 {
  override fun move() = trace("Walk")
}

fun main() {
  val animals1 =
    listOf(Worm1(), Snail1(), Beetle1())
  animals1.forEach { move(it) }
  val animals2 =
    listOf(Worm2(), Snail2(), Beetle2())
  animals2.forEach { it.move() }
  trace eq """
    Wriggle
    Slide
    Walk
    Wriggle
    Slide
    Walk
  """
}
