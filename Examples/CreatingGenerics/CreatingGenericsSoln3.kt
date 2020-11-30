// CreatingGenerics/CreatingGenericsSoln3.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package creatinggenericssoln3
import variance.Cat
import variance.Dog

interface InBox<in T> {
  fun put(item: T)
}

interface OutBox<out T> {
  fun get(): T
}

class Box<T>(private var contents: T) :
  InBox<T>, OutBox<T> {
  override fun put(item: T) {
    contents = item
  }
  override fun get(): T = contents
}

fun main() {
  val catBox: Box<Cat> = Box(Cat())
  val anyBox: OutBox<Any> = catBox
  val x: Any = catBox.get()
  val ic: InBox<Cat> = Box<Any>(Dog())
  ic.put(Cat())
}
