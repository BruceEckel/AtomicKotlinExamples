// Testing/Trace1.kt
import atomictest.*

private val trace = Trace()

fun main() {
  trace("line 1")
  trace(47)
  trace("line 2")
  trace eq """
  line 1
  47
  line 2
  """
}
