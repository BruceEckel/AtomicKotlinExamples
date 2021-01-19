// Sequences/Task5.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package sequencesExercise5

fun School.instructorsWithLargestClass(): Set<Instructor> {
  val maxClassSize = lessons
    .map { it.students.size }
    .maxOrNull()

  return lessons.filter { it.students.size == maxClassSize }
    .map { it.instructor }
    .toSet()
}
