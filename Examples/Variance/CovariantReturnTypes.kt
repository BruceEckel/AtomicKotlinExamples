// Variance/CovariantReturnTypes.kt
package variance2
import variance.*
import atomictest.eq

open class MakeGoose : MakeBird() {
  override fun new(): Goose = Goose()
}

open class MakeCanadaGoose : MakeGoose() {
  override fun new(): CanadaGoose = CanadaGoose()
}

fun main() {
  listOf(
    MakeBird(),
    MakeGoose(),
    MakeCanadaGoose())
    .map(::Make)
    .map { it.second } eq
  listOf(
    "Bird",
    "Goose",
    "CanadaGoose")

  val b: Bird = MakeBird().new()
  val g: Goose = MakeGoose().new()
  val c: CanadaGoose = MakeCanadaGoose().new()
}
