// Properties/Task1.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package propertiesExercise1

class X {
  val a = 3
  val b = 42
  var c: Int = 0
  fun add(): Int {
    c = a + b
    return c
  }
}

fun main() {
  val x = X()
  println(x.add())
}
