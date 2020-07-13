// ExtensionLambdas/Sandwich.kt
package sandwich
import atomictest.eq

open class RecipeUnit {
  override fun toString() =
    "${this::class.simpleName}"
}

open class Recipe: ArrayList<RecipeUnit>()

open class Operation: RecipeUnit()
class Toast: Operation()
class Grill: Operation()

open class Ingredient: RecipeUnit()
open class Bread: Ingredient()
class PeanutButter: Ingredient()
class GrapeJelly: Ingredient()
class Ham: Ingredient()
class Swiss: Ingredient()
class Mustard: Ingredient()

open class Sandwich: Recipe() {
  fun grill(): Sandwich {
    add(Grill())
    return this
  }
  fun toast(): Sandwich {
    add(Toast())
    return this
  }
}

fun sandwich(
  fillings: Sandwich.() -> Unit
): Sandwich {
  val sandwich = Sandwich()
  sandwich.add(Bread())
  sandwich.toast()
  sandwich.fillings()
  return sandwich
}

fun main() {
  val pbj = sandwich {
    add(PeanutButter())
    add(GrapeJelly())
  }
  val hamAndSwiss = sandwich {
    add(Ham())
    add(Swiss())
    add(Mustard())
    grill()
  }
  pbj eq "[Bread, Toast, " +
    "PeanutButter, GrapeJelly]"
  hamAndSwiss eq "[Bread, Toast, " +
    "Ham, Swiss, Mustard, Grill]"
}
