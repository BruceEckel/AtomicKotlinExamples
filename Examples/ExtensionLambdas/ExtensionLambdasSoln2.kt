// ExtensionLambdas/ExtensionLambdasSoln2.kt
package extensionlambdasoln2
import sandwich.*
import atomictest.eq

fun sandwich2(
  prepare: Sandwich.() -> Unit = { this },
  fillings: Sandwich.() -> Unit
): Sandwich {
  val sandwich = Sandwich()
  sandwich.prepare()
  sandwich.fillings()
  return sandwich
}

fun Sandwich.sandwich3(
  fillings: Sandwich.() -> Unit
): Sandwich {
  fillings()
  return this
}

val plainPBJ = sandwich2 {
  add(PeanutButter())
  add(GrapeJelly())
}

val toastedPBJ = sandwich2({ toast() }) {
  add(PeanutButter())
  add(GrapeJelly())
}

val toastedPBJ2 = Sandwich().toast().sandwich3 {
  add(PeanutButter())
  add(GrapeJelly())
}

val grilledPBJ = Sandwich().toast().sandwich3 {
  add(PeanutButter())
  add(GrapeJelly())
}.grill()

fun main() {
  plainPBJ eq "[PeanutButter, GrapeJelly]"
  toastedPBJ eq
    "[Toast, PeanutButter, GrapeJelly]"
  toastedPBJ2 eq
    "[Toast, PeanutButter, GrapeJelly]"
  grilledPBJ eq
    "[Toast, PeanutButter, GrapeJelly, Grill]"
}
