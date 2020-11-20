// LocalFunctions/Task2.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package localFunctionsExercise2

import atomictest.eq

fun createCounter(): Pair<() -> Unit, () -> Int> {
  var counter = 0

  fun inc() {
    counter++
  }

  fun value(): Int {
    return counter
  }

  return Pair(::inc, ::value)
}

fun main() {
  val (inc, value) = createCounter()
  repeat(10) {
    inc()
  }
  value() eq 10
}
