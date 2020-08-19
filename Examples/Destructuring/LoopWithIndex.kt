// Destructuring/LoopWithIndex.kt
// ©2020 Mindview LLC. See Copyright.txt for permissions.
package destructuring
import atomictest.trace

fun main() {
  val list = listOf('a', 'b', 'c')
  for ((index, value) in list.withIndex()) {
    trace("$index:$value")
  }
  trace eq "0:a 1:b 2:c"
}
