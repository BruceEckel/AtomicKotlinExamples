// Variance/SameReturnTypes.kt
package variance

open class MakeDuck1: MakeBird() {
  override fun make(): Bird = Duck()
}

class MakeMallard1: MakeDuck1() {
  override fun make(): Bird = Mallard()
}

fun main() {
  test(MakeDuck1(), "Duck")
  test(MakeMallard1(), "Mallard")
  val d: Duck = MakeDuck1().make() as Duck
  val m: Mallard =
    MakeMallard1().make() as Mallard
}
