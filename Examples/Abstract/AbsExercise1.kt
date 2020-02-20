// Abstract/AbsExercise1.kt
package abstractclasses
import atomictest.*

private val trace = Trace()

abstract class WithParams(
  val i: Int,
  var s: String = ""
) {
  init {
    trace("WithParams $i $s")
  }
}

class Concrete(i: Int, s: String):
  WithParams(i, s) {
  init {
    trace("Concrete $i $s")
  }
}

fun main() {
  Concrete(11, "One Louder")
  trace eq """
    WithParams 11 One Louder
    Concrete 11 One Louder
  """
}
