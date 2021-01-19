// PropertyAccessors/Task4.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package propertyAccessorsExercise4
import atomictest.eq

class AccessCounter {
  private var _accesses = 0

  val accesses: Int
    get() = ++_accesses
}

fun main() {
  val counter = AccessCounter()
  counter.accesses eq 1
  counter.accesses eq 2
  counter.accesses eq 3

  val counter2 = AccessCounter()
  repeat(10) {
    counter2.accesses
  }
  counter2.accesses eq 11
}
