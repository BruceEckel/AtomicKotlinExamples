// CreatingGenerics/Crate.kt
package creatinggenerics
import atomictest.eq

class Crate<T>(private var item: T) {
  fun add(new: T) { item = new }
  fun get(): T = item
}

fun main() {
  val cc = Crate(Car())
  val car: Car = cc.get()
  car eq "Car(name=Car)"
}
