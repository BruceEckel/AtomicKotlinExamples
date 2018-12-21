// Variance/Bird.kt
package variance
import atomictest.eq

open class Bird
open class Duck: Bird()
class Mallard: Duck()

open class MakeBird {
  open fun make(): Bird = Bird()
}

fun test(maker: MakeBird, result: String) {
  val bird = maker.make()
  val name = bird::class.simpleName ?: ""
  name eq result
}

fun main() {
  test(MakeBird(), "Bird")
  val b: Bird = MakeBird().make()
}
