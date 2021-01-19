// Sequences/School3.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package sequencesExercise3

data class Instructor(val name: String)

data class Student(val name: String)

data class Lesson(
  val instructor: Instructor,
  val students: Set<Student>,
  val rating: Map<Student, Int>
)

data class School(
  val instructors: Set<Instructor>,
  val students: Set<Student>,
  val lessons: Sequence<Lesson>
)
