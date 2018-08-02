// BreakAndContinue/WhileControl.kt
import atomictest.*

fun main(args: Array<String>) {
  val nums = mutableListOf(0)
  var i = 0
  while(i < 100) {
    i += 4
    if (i == 8) continue        // [1]
    if (i == 40) break          // [2]
    nums.add(i)
  }
  nums eq
  listOf(0,4,12,16,20,24,28,32,36)
}
