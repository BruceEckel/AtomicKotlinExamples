// SafeCallsAndElvis/ChainedCalls.kt
package safecalls
import atomictest.eq

class Person(
  val name: String,
  var friend: Person? = null
)

fun main(args: Array<String>) {
  val alice = Person("Alice")
  alice.friend?.friend?.name eq null  // [1]

  val bob = Person("Bob")
  val charlie = Person("Charlie", bob)
  bob.friend = charlie
  bob.friend?.friend?.name eq "Bob"   // [2]

  (alice.friend?.friend?.name
    ?: "Unknown") eq "Unknown"        // [3]
}
