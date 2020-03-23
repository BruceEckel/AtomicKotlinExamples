// Objects/ObjectKeyword.kt
package objects
import atomictest.eq

object JustOne {
  val n = 2
  fun f() = n * 10
  fun g() = this.n * 20   // [1]
}

fun main() {
  // val x = JustOne() // Error
  JustOne.n eq 2
  JustOne.f() eq 20
  JustOne.g() eq 40
}
