// ComplexConstructors/InitSection.kt
package complexconstructors
import atomictest.eq

private var counter = 0

class Message(text: String) {
  private val content: String

  init {
    counter += 10
    content = "[$counter] $text"
  }

  override fun toString() = content
}

fun main() {
  val m1 = Message("Big ba-da boom!")
  m1 eq "[10] Big ba-da boom!"
  val m2 = Message("Bzzzzt!")
  m2 eq "[20] Bzzzzt!"
}
