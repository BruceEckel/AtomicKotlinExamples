// safeCallsAndElvisOperator/ChainedSafeCalls.kt
import atomicTest.eq

class Person(val name: String, var bestFriend: Person? = null)

fun main(args: Array<String>) {
  val alice = Person("Alice")
  val bob = Person("Bob", alice)

  alice.bestFriend?.bestFriend?.name eq null     // [1]

  alice.bestFriend = bob

  alice.bestFriend?.bestFriend?.name eq "Alice"  // [2]
}
