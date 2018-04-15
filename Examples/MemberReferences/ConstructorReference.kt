// MemberReferences/ConstructorReference.kt
package memberreferences3

import atomictest.eq

data class Student(
  val id: Int,
  val name: String
)

fun main(args: Array<String>) {
  val names = listOf("Alice", "Bob")

  val students =
    names.mapIndexed { index, name ->
      Student(index, name)
    }
  students eq listOf(Student(0, "Alice"),
    Student(1, "Bob"))

  names.mapIndexed(::Student) eq students
}
