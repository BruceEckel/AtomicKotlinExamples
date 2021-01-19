// IntroGenerics/RigidHolder.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package introgenerics
import atomictest.eq

data class Automobile(val brand: String)

class RigidHolder(private val a: Automobile) {
  fun getValue() = a
}

fun main() {
  val holder = RigidHolder(Automobile("BMW"))
  holder.getValue() eq
    "Automobile(brand=BMW)"
}
