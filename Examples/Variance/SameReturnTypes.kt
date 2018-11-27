// Variance/SameReturnTypes.kt
package variance1
import variance.*

open class MakeBird {
  open fun create(): Bird = Bird()
}

open class MakeGoose : MakeBird() {
  override fun create(): Bird = Goose()
}

open class MakeCanadaGoose : MakeGoose() {
  override fun create(): Bird = CanadaGoose()
}

fun main() {
  listOf(
    MakeBird(),
    MakeGoose(),
    MakeCanadaGoose())
      .map(MakeBird::create)
      .forEach {
        println(it::class.simpleName)
      }
  // Type mismatch: inferred type is
  // Bird but Goose was expected:
  // val g: Goose = MakeGoose().create()
}
/* Output:
Bird
Goose
CanadaGoose
*/
