// IntroToGenerics/GenericHolder.kt
package introtogenerics
import atomictest.eq

class GenericHolder<T>(              // [1]
  private val value: T
) {
  fun get(): T = value
}

fun main(args: Array<String>) {
  val h1 = GenericHolder(Automobile("Ford"))
  val a: Automobile = h1.get()       // [2]
  a eq "Automobile(brand=Ford)"

  val h2 = GenericHolder(1)
  val i: Int = h2.get()              // [3]
  i eq 1

  val h3 = GenericHolder("Chartreuse")
  val s: String = h3.get()           // [4]
  s eq "Chartreuse"
}
