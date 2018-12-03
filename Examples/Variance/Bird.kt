// Variance/Bird.kt
package variance

open class Bird
open class Goose: Bird()
open class CanadaGoose: Goose()

open class MakeBird {
  open fun new(): Bird = Bird()
}

fun Make(m: MakeBird): Pair<Bird, String> {
  val bird = m.new()
  val name = bird::class.simpleName ?: ""
  return Pair(bird, name)
}
