// Hashing/EasyKeys.kt
package hashing
import atomictest.eq

data class Employee(val first: String,
  val last: String, val id: Int)

fun main(args: Array<String>) {
  val employees = HashSet(setOf(
    Employee("Lucia", "Dubois", 1),
    Employee("Bob", "Dobbs", 2),
    Employee("Ilsa", "Schmidt", 3)))
  employees.joinToString(separator = "\n") eq
    """
    Employee(first=Bob, last=Dobbs, id=2)
    Employee(first=Lucia, last=Dubois, id=1)
    Employee(first=Ilsa, last=Schmidt, id=3)
    """.trimIndent()

  (Employee("Ilsa", "Schmidt", 3)
    in employees) eq true
}
