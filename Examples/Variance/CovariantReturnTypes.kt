// Variance/CovariantReturnTypes.kt
package variance

open class MakeDuck2: MakeBird() {
  override fun make(): Duck = Duck()
}

class MakeMallard2: MakeDuck2() {
  override fun make(): Mallard = Mallard()
}

class Bicycle

class MakeBicycle: MakeBird() {
  // Fails:
  // override fun make(): Bicycle = Bicycle()
  val errorMessage = """
  Return type of 'make' is not a subtype of
  the return type of the overridden member
  'public open fun make(): Bird'
  """
}

fun main() {
  test(MakeDuck2(), "Duck")
  test(MakeMallard2(), "Mallard")
  val d: Duck = MakeDuck2().make()
  val m: Mallard = MakeMallard2().make()
}
