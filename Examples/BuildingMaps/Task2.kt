// BuildingMaps/Task2.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package buildingMapsExercise2

import atomictest.eq

fun <T, R> List<T>.groupBy(keySelector: (T) -> R): Map<R, List<T>> {
  val result = mutableMapOf<R, MutableList<T>>()
  for (element in this) {
    val list = result.getOrPut(keySelector(element)) { mutableListOf() }
    list += element
  }
  return result
}

data class Person(val name: String, val age: Int)

fun main() {
  val people = listOf(Person("Alice", 21),
    Person("Bob", 25), Person("Charlie", 25))

  people.groupBy(Person::age) eq
    "{21=[Person(name=Alice, age=21)], " +
    "25=[Person(name=Bob, age=25), Person(name=Charlie, age=25)]}"
}
