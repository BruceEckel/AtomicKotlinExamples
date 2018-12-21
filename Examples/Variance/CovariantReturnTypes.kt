// Variance/CovariantReturnTypes.kt
package variance

open class MakeDuck2 : MakeBird() {
  override fun make(): Duck = Duck()
}

class MakeMallard2 : MakeDuck2() {
  override fun make(): Mallard = Mallard()
}

fun main() {
  test(MakeDuck2(), "Duck")
  test(MakeMallard2(), "Mallard")
  val d: Duck = MakeDuck2().make()
  val m: Mallard = MakeMallard2().make()
}
