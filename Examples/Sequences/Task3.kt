// Sequences/Task3.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package sequencesExercise3

fun School.averageInstructorRating(instructor: Instructor): Double =
  lessons
    .filter { it.instructor == instructor }
    .flatMap { it.rating.values.asSequence() }
    .average()
