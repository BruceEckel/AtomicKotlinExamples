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

val PBJ1 = sandwich2 {
  add(PeanutButter())
  add(GrapeJelly())
}

val PBJ2 = sandwich2({ toast() }) {
  add(PeanutButter())
  add(GrapeJelly())
}

val PBJ3 = Sandwich().toast().sandwich3 {
  add(PeanutButter())
  add(GrapeJelly())
}

val PBJ4 = Sandwich().toast().sandwich3 {
  add(PeanutButter())
  add(GrapeJelly())
}.grill()

fun main() {
  PBJ1 eq "[PeanutButter, GrapeJelly]"
  PBJ2 eq "[Toast, PeanutButter, GrapeJelly]"
  PBJ3 eq "[Toast, PeanutButter, GrapeJelly]"
  PBJ4 eq
    "[Toast, PeanutButter, GrapeJelly, Grill]"
}
