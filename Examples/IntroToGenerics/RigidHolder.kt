// IntroToGenerics/RigidHolder.kt
package introtogenerics
import atomictest.eq

data class Automobile(val brand: String)

class RigidHolder(private val a: Automobile) {
  fun get() = a
}

fun main(arg: Array<String>) {
  RigidHolder(Automobile("Peugot")).get() eq
    "Automobile(brand=Peugot)"
}
