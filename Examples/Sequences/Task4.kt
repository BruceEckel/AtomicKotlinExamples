// Sequences/Task4.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package sequencesExercise4

fun School.favoriteInstructor(student: Student): Instructor? =
  lessons
    .filter { student in it.students }
    .groupBy { it.instructor }
    .maxByOrNull { (_, lessons) -> lessons.size }
    ?.key
