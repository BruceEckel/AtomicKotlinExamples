// Upcasting/UpcastExercise1.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package upcastingExercise1
import atomictest.trace

interface Rodent {
  fun eat(): String
  fun speak(): String
}

class Mouse: Rodent {
  override fun eat() = "Mouse.eat"
  override fun speak() = "Mouse.speak"
}

class KangarooRat: Rodent {
  override fun eat() = "KangarooRat.eat"
  override fun speak() = "KangarooRat.speak"
  fun jump() = "KangarooRat.jump"
}

fun upcast(rodent: Rodent) {
  trace(rodent.eat())
  trace(rodent.speak())
  //  rodent.jump() // Won't compile
}

fun main() {
  val mouse = Mouse()
  val kangarooRat = KangarooRat()
  trace(kangarooRat.jump())
  upcast(mouse)
  upcast(kangarooRat)
  trace eq """
    KangarooRat.jump
    Mouse.eat
    Mouse.speak
    KangarooRat.eat
    KangarooRat.speak
  """
}
