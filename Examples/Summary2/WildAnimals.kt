// Summary2/WildAnimals.kt
import atomictest.eq

class Badger(name: String, age: Int) {
  val name = name
  val age = age
  override fun toString(): String {
    return "Badger: $name, age: $age"
  }
}

class Snake(
  val type: String,
  val length: Double
) {
  override fun toString(): String {
    return "Snake: $type, length: $length"
  }
}

class Moose(
  val age: Int,
  val height: Double
) {
  override fun toString(): String {
    return "Moose, age: $age, height: $height"
  }
}

fun main(args: Array<String>) {
  Badger("Bob", 11) eq "Badger: Bob, age: 11"
  Snake("Garden", 2.4) eq
    "Snake: Garden, length: 2.4"
  Moose(16, 7.2) eq
    "Moose, age: 16, height: 7.2"
}
