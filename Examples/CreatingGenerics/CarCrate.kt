// CreatingGenerics/CarCrate.kt
// ©2020 Mindview LLC. See Copyright.txt for permissions.
package creatinggenerics
import atomictest.eq

class Car {
  override fun toString() = "Car"
}

class CarCrate(private var c: Car) {
  fun put(car: Car) { c = car }
  fun get(): Car = c
}

fun main() {
  val cc = CarCrate(Car())
  val car: Car = cc.get()
  car eq "Car"
}
