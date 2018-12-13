// Variance/SameReturnTypes.kt
package variance

open class NewDuck1 : NewBird() {
  override fun new(): Bird = Duck()
}

class NewMallard1 : NewDuck1() {
  override fun new(): Bird = Mallard()
}

fun main() {
  test(NewDuck1(), "Duck")
  test(NewMallard1(), "Mallard")
  val b: Bird = NewBird().new()
  val g: Bird = NewDuck1().new()
  val c: Bird = NewMallard1().new()
}
