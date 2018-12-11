// Variance/CovariantReturnTypes.kt
package variance2
import variance.*

open class NewDuck : NewBird() {
  override fun new(): Duck = Duck()
}

open class NewMallard : NewDuck() {
  override fun new(): Mallard = Mallard()
}

fun main() {
  test(NewBird(), NewDuck(), NewMallard())
  val b: Bird = NewBird().new()
  val g: Duck = NewDuck().new()
  val c: Mallard = NewMallard().new()
}
