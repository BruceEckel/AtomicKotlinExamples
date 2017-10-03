// UsingOperators/DestructuringData.kt
package usingoperators

data class Person(val name: String, val age: Int) {
  // This generates:
  // fun component1() = name
  // fun component2() = age
}

fun main(args: Array<String>) {
  val person = Person("Alice", 29)
  val (name, age) = person
  // Under the hood is compiled to:
  // val name = person.component1()
  // val age = person.component2()
}
