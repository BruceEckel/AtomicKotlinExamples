// ClassDelegation/Task2.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package classDelegationExercise2
import atomictest.trace

// Duck Library
interface Duck {
  fun quack()
  fun swim()
}

class RealDuck : Duck {
  override fun quack() = trace("quack")
  override fun swim() = trace("swim")
}

fun interactWithDuck(duck: Duck) {
  duck.quack()
  duck.swim()
}

// Our codebase
interface Crocodile {
  fun bite()
}

class RealCrocodile : Crocodile {
  override fun bite() = trace("Mnom-mnom")
}

fun interactWithCrocodile(crocodile: Crocodile) {
  trace("Panic!!!")
  crocodile.bite()
}

class CrocoDuck(
  private val crocodile: Crocodile
) : Duck, Crocodile by crocodile {
  override fun quack() = crocodile.bite()
  override fun swim() = crocodile.bite()
}

fun mimicDuck(crocodile: Crocodile): CrocoDuck =
  CrocoDuck(crocodile)

fun main() {
  val honestlyDuck = mimicDuck(RealCrocodile())
  interactWithDuck(honestlyDuck)
  interactWithCrocodile(honestlyDuck)
  trace eq """
    Mnom-mnom
    Mnom-mnom
    Panic!!!
    Mnom-mnom
  """
}
