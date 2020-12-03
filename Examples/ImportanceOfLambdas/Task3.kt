// ImportanceOfLambdas/Task3.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package theImportanceOfLambdasExercise3
import atomictest.eq

fun other(s: String): String =
  s.filterIndexed { index, _ -> index % 2 == 0 }

fun main() {
  other("cement") eq "cmn"
}
