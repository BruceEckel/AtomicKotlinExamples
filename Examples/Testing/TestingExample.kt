// Testing/TestingExample.kt
// ©2020 Mindview LLC. See Copyright.txt for permissions.
import atomictest.*

fun main() {
  val v1 = 11
  val v2 = "Ontology"

  // 'eq' means "equals":
  v1 eq 11
  v2 eq "Ontology"

  // 'neq' means "not equal"
  v2 neq "Epistimology"

  // [Error] Epistimology != Ontology
  // v2 eq "Epistimology"
}
/* Output:
11
Ontology
Ontology
*/
