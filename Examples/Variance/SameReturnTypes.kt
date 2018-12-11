// Variance/SameReturnTypes.kt
package variance1
import variance.*

open class NewDuck : NewBird() {
  override fun new(): Bird = Duck()
}

open class NewMallard : NewDuck() {
  override fun new(): Bird = Mallard()
}

fun main() {
  test(NewBird(), NewDuck(), NewMallard())
  val b: Bird = NewBird().new()
  val g: Bird = NewDuck().new()
  val c: Bird = NewMallard().new()
}
