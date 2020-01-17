// Upcasting/UpcastExercise1.kt
package upcasting
import atomictest.*

private var trace = Trace()

interface Rodent {
  fun eat()
  fun speak()
}

class Mouse: Rodent {
  override fun eat() =
    trace("Mouse.eat")
  override fun speak() =
    trace("Mouse.speak")
}

class KangarooRat: Rodent {
  override fun eat() =
    trace("KangarooRat.eat")
  override fun speak() =
    trace("KangarooRat.speak")
  fun jump() =
    trace("KangarooRat.jump")
}

fun upcast(rodent: Rodent) {
  rodent.eat()
  rodent.speak()
  // rodent.jump() // Won't compile
}

fun main() {
  val mouse = Mouse()
  val kangarooRat = KangarooRat()
  kangarooRat.jump()
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
