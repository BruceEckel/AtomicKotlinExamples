// SafeCallsAndElvis/ChainedCalls.kt
package safecalls
import atomictest.eq

class Person(
  val name: String,
  var bestFriend: Person? = null
)

fun main(args: Array<String>) {
  val alice = Person("Alice")

  alice.bestFriend
    ?.bestFriend?.name eq null         // [1]

  val bob = Person("Bob")
  val charlie = Person("Charlie", bob)
  bob.bestFriend = charlie

  bob.bestFriend
    ?.bestFriend?.name eq "Bob"        // [2]

  (alice.bestFriend?.bestFriend?.name
    ?: "Unknown") eq "Unknown"         // [3]
}
