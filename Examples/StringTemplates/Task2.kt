// StringTemplates/Task2.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package stringTemplatesExercise2

fun record(index: Int, status: String, message: String): String =
  "$index. [$status] $message\n"

fun main() {
  print(record(1, "OK", "Everything is fine."))
  print(record(2, "Fail", "Something has broken."))
}

/* Output:
1. [OK] Everything is fine.
2. [Fail] Something has broken.
*/
