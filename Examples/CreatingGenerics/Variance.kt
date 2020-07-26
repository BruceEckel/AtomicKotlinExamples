// CreatingGenerics/Variance.kt
package creatinggenerics

class Crate<T>(private var item: T) {
  fun putIn(new: T) { item = new }
  fun getOut(): T = item
}

class CovariantCrate<out T>(
  private var item: T
) {
  // fun putIn(new: T) { item = new }
  fun getOut(): T = item
}

class ContravariantCrate<in T>(
  private var item: T
) {
  fun putIn(new: T) { item = new }
  // fun getOut(): T = item
}

open class Pet
class Pug: Pet()

open class Beverage
class Beer: Beverage()

fun main() {
  Crate<Pet>(Pet())
  Crate<Pet>(Pug())
  CovariantCrate<Pet>(Pet())
  CovariantCrate<Pet>(Pug())
}
