// Variance/Bird.kt
package variance
import atomictest.eq

open class Bird
open class Duck: Bird()
class Mallard: Duck()

open class NewBird {
  open fun new(): Bird = Bird()
}

fun test(maker: NewBird, result: String) {
  val bird = maker.new()
  val name = bird::class.simpleName ?: ""
  name eq result
}

fun main() {
  test(NewBird(), "Bird")
}
