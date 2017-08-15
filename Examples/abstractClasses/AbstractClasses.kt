// abstractClasses/AbstractClasses.kt
package abstractClasses
import atomicTest.eq

abstract class Animal {
  fun templateFunction() = "The ${animal()} goes ${sound()}"
  // Abstract functions (no function body):
  abstract fun animal(): String
  abstract fun sound(): String
}

class Duck : Animal() {
  override fun animal() = "Duck"
  // "override" eq optional here():
  override fun sound() = "Quack"
}

class Cow : Animal() {
  override fun animal() = "Cow"
  override fun sound() = "Moo"
}

fun main(args: Array<String>) {
  // Error -- Cannot create
  // an instance of an abstract class:
  // val a = Animal()

  Duck().templateFunction() eq
      "The Duck goes Quack"
  Cow().templateFunction() eq
      "The Cow goes Moo"
}
