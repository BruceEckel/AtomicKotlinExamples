// ImportanceOfLambdas/Task1.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package theImportanceOfLambdasExercise1
import atomictest.eq

class Person(val name: String, val age: Int)

fun List<Person>.getNamesOfAdults(): List<String> =
  filter { it.age > 17 }.map { it.name }

fun main() {
  val people = listOf(Person("Alice", 17), Person("Bob", 19))
  people.getNamesOfAdults() eq listOf("Bob")
}
