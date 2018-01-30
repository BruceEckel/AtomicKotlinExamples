// Generics/GenericHolder.kt
package generics
import atomictest.eq

class GenericHolder<T>(private val a: T) {
  fun get(): T = a
}

fun main(args: Array<String>) {
  val gh = GenericHolder(Automobile("Ford"))
  val a: Automobile = gh.get() // Correct type
  a eq "Automobile(brand=Ford)"
  val ghi = GenericHolder(1)
  val b: Int = ghi.get()
  b eq 1
  val ghs = GenericHolder("Chartreuse")
  val c: String = ghs.get()
  c eq "Chartreuse"
}
