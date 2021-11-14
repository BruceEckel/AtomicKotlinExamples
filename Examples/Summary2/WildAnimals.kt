// Summary2/WildAnimals.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package summary2
import atomictest.eq

class Badger(id: String, years: Int) {
  val name = id
  val age = years
  override fun toString() =
    "Badger: $name, age: $age"
}

class Snake(
  var type: String,
  var length: Double
) {
  override fun toString() =
    "Snake: $type, length: $length"
}

class Moose(
  val age: Int,
  val height: Double
) {
  override fun toString() =
    "Moose, age: $age, height: $height"
}

fun main() {
  Badger("Bob", 11) eq "Badger: Bob, age: 11"
  Snake("Garden", 2.4) eq
    "Snake: Garden, length: 2.4"
  Moose(16, 7.2) eq
    "Moose, age: 16, height: 7.2"
}
