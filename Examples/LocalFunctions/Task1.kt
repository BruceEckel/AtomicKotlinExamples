// LocalFunctions/Task1.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package localFunctionsExercise1

fun f(): Int {
  fun g(): Int {
    fun h() = 47
    return h()
  }
  return g()
}

fun main() {
  println(f())
}
