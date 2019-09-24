// ScopeFunctions/ResultOfWith.kt
package scopefunctions
import atomictest.eq

fun main() {
  val mutableList = mutableListOf<Int>()
  val result = with(mutableList) {
    add(17)
    add(42)
    remove(0)
  }
  result eq false
  mutableList eq listOf(17, 42)
}
