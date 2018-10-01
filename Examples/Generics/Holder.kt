// Generics/Holder.kt
package generics
import atomictest.eq

class Holder<T>(val a: T) {
  fun get(): T = a
}

fun main() {
  val ah = Holder(Auto())
  val x: Auto = ah.a
  val y: Auto = ah.get()
  y eq "Auto(name=Car)"
}
