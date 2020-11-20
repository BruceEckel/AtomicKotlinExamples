// Sequences/Task5.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package sequencesExercise5

fun School.findInstructorsWithLargestClass(): Set<Instructor> {
  val maxClassSize = lessons
    .map { it.students.size }
    .max()

  return lessons.filter { it.students.size == maxClassSize }
    .groupBy { it.instructor }
    .keys
}
