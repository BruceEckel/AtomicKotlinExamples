// Casting/HumanAlice.kt
package casting
import atomictest.eq

interface Human

class Alice: Human {
  fun name() = "I'm Alice"
}

fun main() {
  val human: Human = Alice()  // [1]
  if (human is Alice) {
    // Code in this block assumes
    // human is an Alice object
    human.name() eq "I'm Alice"
  }
}
