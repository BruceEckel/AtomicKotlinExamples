// Sequences/Task1.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package sequencesExercise1

fun School.commonLessons(
  instructor: Instructor,
  student: Student
): Sequence<Lesson> {
  return lessons.filter {
    instructor == it.instructor && student in it.students
  }
}
