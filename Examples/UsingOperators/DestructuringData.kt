// UsingOperators/DestructuringData.kt
package usingoperators
import atomictest.eq

data class Person(
  val name: String,
  val age: Int
) {
  // Compiler generates:
  // fun component1() = name
  // fun component2() = age
}

fun main(args: Array<String>) {
  val person = Person("Alice", 29)
  val (name, age) = person
  // Destructuring assignment compiles to:
  val name_ = person.component1()
  val age_ = person.component2()
  name eq "Alice"
  age eq 29
  name_ eq "Alice"
  age_ eq 29
}
