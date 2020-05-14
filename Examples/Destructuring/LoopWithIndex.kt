// Destructuring/LoopWithIndex.kt
package destructuringInLoops
import atomictest.Trace


fun main() {
  val trace = Trace()
  val list = listOf('a', 'b', 'c')
  for ((index, value) in list.withIndex()) {
    trace("$index:$value")
  }
  trace eq "0:a 1:b 2:c"
}
