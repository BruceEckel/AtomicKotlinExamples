// NamedAndDefaultArgs/Task3.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package namedAndDefaultArgumentsExercise3
import atomictest.eq

fun joinComments(s: String): String =
  s.trimMargin("// ").lines().joinToString("; ")

fun main() {
  val s = """
        // First
        // Second
        // Third
        """
  joinComments(s) eq "First; Second; Third"
}
