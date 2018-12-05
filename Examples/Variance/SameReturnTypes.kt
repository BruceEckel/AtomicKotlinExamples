// Variance/SameReturnTypes.kt
package variance1
import variance.*
import atomictest.eq

open class MakeGoose : MakeBird() {
  override fun new(): Bird = Goose()
}

open class MakeCanadaGoose : MakeGoose() {
  override fun new(): Bird = CanadaGoose()
}

fun main() {
  listOf(
    MakeBird(),
    MakeGoose(),
    MakeCanadaGoose())
    .map(::make)
    .map { it.second } eq
  listOf(
    "Bird",
    "Goose",
    "CanadaGoose")

  val b: Bird = MakeBird().new()
  val g: Bird = MakeGoose().new()
  val c: Bird = MakeCanadaGoose().new()
}
