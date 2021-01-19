// IntroGenerics/GenericHolder.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package introgenerics
import atomictest.eq

class GenericHolder<T>(               // [1]
  private val value: T
) {
  fun getValue(): T = value
}

fun main() {
  val h1 = GenericHolder(Automobile("Ford"))
  val a: Automobile = h1.getValue()   // [2]
  a eq "Automobile(brand=Ford)"

  val h2 = GenericHolder(1)
  val i: Int = h2.getValue()          // [3]
  i eq 1

  val h3 = GenericHolder("Chartreuse")
  val s: String = h3.getValue()       // [4]
  s eq "Chartreuse"
}
