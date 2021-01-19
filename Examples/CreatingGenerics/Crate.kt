// CreatingGenerics/Crate.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package creatinggenerics
import atomictest.eq

open class Crate<T>(private var contents: T) {
  fun put(item: T) { contents = item }
  fun get(): T = contents
}

fun main() {
  val cc = Crate(Car())
  val car: Car = cc.get()
  car eq "Car"
}
