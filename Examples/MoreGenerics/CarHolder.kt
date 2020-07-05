// MoreGenerics/CarHolder.kt
package moregenerics
import atomictest.eq

data class Car(val name: String = "Car")

class CarHolder(val c: Car)

fun main() {
  val ch = CarHolder(Car())
  val x: Car = ch.c
  x eq "Car(name=Car)"
}
