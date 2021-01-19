// LocalFunctions/Task1.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package localFunctionsExercise1
import atomictest.eq

fun f(): Int {
  fun g(): Int {
    fun h() = 47
    return h()
  }
  return g()
}

fun main() {
  f() eq 47
}
