// Composition/Car.kt
// ©2020 Mindview LLC. See Copyright.txt for permissions.
package composition
import atomictest.*

class Engine {
  fun start() = trace("Engine start")
  fun stop() = trace("Engine stop")
}

class Wheel {
  fun inflate(psi: Int) =
    trace("Wheel inflate($psi)")
}

class Window(val side: String) {
  fun rollUp() =
    trace("$side Window roll up")
  fun rollDown() =
    trace("$side Window roll down")
}

class Door(val side: String) {
  val window = Window(side)
  fun open() = trace("$side Door open")
  fun close() = trace("$side Door close")
}

class Car {
  val engine = Engine()
  val wheel = List(4) { Wheel() }
  // Two door:
  val leftDoor = Door("left")
  val rightDoor = Door("right")
}

fun main() {
  val car = Car()
  car.leftDoor.open()
  car.rightDoor.window.rollUp()
  car.wheel[0].inflate(72)
  car.engine.start()
  trace eq """
    left Door open
    right Window roll up
    Wheel inflate(72)
    Engine start
  """
}
