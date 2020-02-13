// SealedClasses/SealedEx3.kt
package sealedclassesex3
import atomictest.eq
import kotlin.random.Random

sealed class Top {
  class Middle1 : Top()
  class Middle2 : Top()
  open class Middle3 : Top()
  class Bottom3 : Middle3()
}

fun main() {
  Top::class.sealedSubclasses
    .map { it.simpleName } eq
    "[Middle1, Middle2, Middle3]"
  val rand = Random(17)
  Top::class.sealedSubclasses
    .random(rand).simpleName eq "Middle3"
}
