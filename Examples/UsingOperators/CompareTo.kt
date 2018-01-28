// UsingOperators/CompareTo.kt
package usingoperators
import atomictest.eq

data class Contact(
  val name: String,
  val mobile: String
) : Comparable<Contact> {
  override
  fun compareTo(other: Contact): Int =
    name.compareTo(other.name)
}

fun main(args: Array<String>) {
  val alice = Contact("Alice", "0123456789")
  val bob = Contact("Bob", "9876543210")
  (alice < bob) eq true
  (alice <= bob) eq true
  (alice > bob) eq false
  (alice >= bob) eq false
  val contacts = listOf(alice, bob)
  contacts.sorted() eq listOf(alice, bob)
  contacts.sortedDescending() eq
    listOf(bob, alice)
}
