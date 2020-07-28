// CreatingGenerics/CarCrate.kt
package creatinggenerics
import atomictest.eq

data class Car(val name: String = "Car")

class CarCrate(private var c: Car) {
  fun add(car: Car) { c = car }
  fun get(): Car = c
}

fun main() {
  val cc = CarCrate(Car())
  val car: Car = cc.get()
  car eq "Car(name=Car)"
}
