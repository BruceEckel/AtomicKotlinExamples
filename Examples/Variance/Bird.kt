// Variance/Bird.kt
package variance

open class Bird
open class Goose: Bird()
open class CanadaGoose: Goose()

open class MakeBird {
  open fun new(): Bird = Bird()
}

fun make(m: MakeBird): Pair<Bird, String> {
  val bird = m.new()
  val name = bird::class.simpleName ?: ""
  return Pair(bird, name)
}

fun birds(makerList: List<MakeBird>):
List<String> = makerList.map(::make)
  .map { it.second }
