// Variance/CovariantReturnTypes.kt
package variance2
import variance.*

open class MakeBird {
  open fun create(): Bird = Bird()
}

open class MakeGoose : MakeBird() {
  override fun create(): Goose = Goose()
}

open class MakeCanadaGoose : MakeGoose() {
  override fun create(): CanadaGoose = CanadaGoose()
}

fun main() {
  val s: Bird = MakeBird().create()
  val e: Goose = MakeGoose().create()
  val c: CanadaGoose = MakeCanadaGoose().create()
}
