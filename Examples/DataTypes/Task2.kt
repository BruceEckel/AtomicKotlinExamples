// DataTypes/Task2.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package dataTypesExercise2

fun main() {
  val int: Int = 10
  val double: Double = 1.1
  val boolean: Boolean = false
  val string: String = "abc"
  val character: Char = 'a'

  // Can be combined:
  // String can be combined with every other type:
  val si: String = string + int
  val sd: String = string + double
  val sb: String = string + boolean
  val sc: String = string + character

  val d1: Double = int + double
  val d2: Double = double + int
  val s1: String = character + string
  val c1: Char = character + int

  println("The type that can be combined " +
    "with every other type using '+':")
  println("String")

  // Can't be combined:
  // val bb = boolean + boolean
  // val ic = int + character
  // val ds = double + string

  println("The type that can't be combined " +
    "with itself using '+':")
  println("Boolean")
}
