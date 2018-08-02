// BreakAndContinue/ForControl.kt
import atomictest.*

fun main(args: Array<String>) {
  val nums = mutableListOf(0)
  for(i in 4 until 100 step 4) {
    if (i == 8) continue        // [1]
    if (i == 40) break          // [2]
    nums.add(i)
  }
  nums eq
  listOf(0,4,12,16,20,24,28,32,36)
}
