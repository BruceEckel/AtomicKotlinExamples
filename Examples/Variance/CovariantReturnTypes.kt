// Variance/CovariantReturnTypes.kt
package variance

open class NewDuck2 : NewBird() {
  override fun new(): Duck = Duck()
}

class NewMallard2 : NewDuck2() {
  override fun new(): Mallard = Mallard()
}

fun main() {
  test(NewDuck2(), "Duck")
  test(NewMallard2(), "Mallard")
  val b: Bird = NewBird().new()
  val g: Duck = NewDuck2().new()
  val c: Mallard = NewMallard2().new()
}
