// Generics/Holder.kt
package generics
import atomictest.eq

class Holder<T>(val a: T) {
  fun get(): T = a
}

fun main() {
  val ch = Holder(Car())
  val x: Car = ch.a
  val y: Car = ch.get()
  y eq "Car(name=Car)"
}
