// ExtensionLambdas/ExtensionLambdasSoln2.kt
package extensionlambdasoln2
import extensionlambdas.Bread

fun sandwich2(
  prepare: Bread.() -> Bread = { this },
  addFillings: Bread.() -> Unit
): Bread {
  val bread = Bread()
  val prepared = bread.prepare()
  prepared.addFillings()
  return prepared
}

fun Bread.sandwich3(
  addFillings: Bread.() -> Unit
): Bread {
  addFillings()
  return this
}

val plainPBJ = sandwich2 {
  peanutButter()
  grapeJelly()
}

val toastedPBJ = sandwich2({ toast() }) {
  peanutButter()
  grapeJelly()
}

val toastedPBJ2 = Bread().toast().sandwich3 {
  peanutButter()
  grapeJelly()
}

val grilledPBJ = Bread().toast().sandwich3 {
  peanutButter()
  grapeJelly()
}.grill()

fun main() {
  println(plainPBJ)
}
