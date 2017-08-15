// testing/TestingExample.kt
import atomicTest.*

fun main(args: Array<String>) {
  val v1 = 11
  val v2 = "Ontology"

  // Test expressions using 'eq' ("equals"):
  v1 eq 11
  v2 eq "Ontology"

  // 'neq' means "not equal"
  v2 neq "Epistimology"

  // Error: Epistimology != Ontology
  // v2 eq "Epistimology"
}
/* Output:
11
Ontology
Ontology
*/
