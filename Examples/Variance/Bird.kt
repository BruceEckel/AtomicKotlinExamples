// Variance/Bird.kt
package variance
import atomictest.eq

open class Bird
open class Duck: Bird()
open class Mallard: Duck()

open class NewBird {
  open fun new(): Bird = Bird()
}

fun make(m: NewBird): Pair<Bird, String> {
  val bird = m.new()
  val name = bird::class.simpleName ?: ""
  return Pair(bird, name)
}

fun test(vararg makers: NewBird) {
  makers
    .map(::make)
    .map { it.second } eq
    listOf("Bird", "Duck", "Mallard")
}
